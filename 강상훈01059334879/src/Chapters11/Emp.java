package Chapters11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Emp extends JFrame {

	private JPanel mainPanel;
	private JTextField idField;
	private JPasswordField pwdField;
	private JTextField joinIdField;
	private JTextField joinNameField;
	private JTextField joinPhoneField;
	private JPasswordField joinPwdField;
	private JPasswordField joinRePwdField;
	private JLabel welcomeMessage;
	
	private boolean joinIdCheckFlag = false;
	private UserBean loginUserBean = null;
	private JPasswordField updatePwText;
	private JPasswordField updatePwdText;
	private JTextField updateNameText;
	private JTextField updatePhoneText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp frame = new Emp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Emp() {
		ArrayList<UserBean> userList = new ArrayList<UserBean>();	
			
		CardLayout mainCard = new CardLayout();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 388);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(mainCard);
		
		JPanel mainView = new JPanel();
		mainPanel.add(mainView, "name_1332333502100");
		mainView.setLayout(null);
		
		JLabel mainTitleLabel = new JLabel("\uC0AC\uC6D0\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		mainTitleLabel.setFont(new Font("굴림", Font.BOLD, 30));
		mainTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainTitleLabel.setBounds(199, 47, 400, 39);
		mainView.add(mainTitleLabel);
		
		JButton mainStartButton = new JButton("\uD504\uB85C\uADF8\uB7A8 \uC2DC\uC791");
		mainStartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_1359244071100");
				
			}
		});
		mainStartButton.setBounds(307, 214, 200, 39);
		mainView.add(mainStartButton);
		
		JPanel loginView = new JPanel();
		mainPanel.add(loginView, "name_1359244071100");
		loginView.setLayout(null);
		
		JLabel idLable = new JLabel("\uC544\uC774\uB514");
		idLable.setBounds(220, 126, 57, 15);
		loginView.add(idLable);
		
		JLabel pwdLable = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		pwdLable.setBounds(220, 168, 57, 15);
		loginView.add(pwdLable);
		
		idField = new JTextField();
		idField.setBounds(289, 123, 206, 21);
		loginView.add(idField);
		idField.setColumns(10);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(289, 165, 206, 21);
		loginView.add(pwdField);
		
		JLabel loginTitle = new JLabel("\uB85C\uADF8\uC778 \uD398\uC774\uC9C0");
		loginTitle.setFont(new Font("굴림", Font.BOLD, 30));
		loginTitle.setHorizontalAlignment(SwingConstants.CENTER);
		loginTitle.setBounds(250, 36, 291, 48);
		loginView.add(loginTitle);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String idText = idField.getText();
				String pwdText = pwdField.getText();
				
				UserMgrPool userMgrPool = new UserMgrPool();
				if(userMgrPool.loginCheck(idText, pwdText)) {
					loginUserBean = userMgrPool.getUserBean(idText, pwdText);
					welcomeMessage.setText(loginUserBean.getUser_name() + "님 환영합니다.");
					mainCard.show(mainPanel, "name_1364875108500");
					return;
				}
				
				for(UserBean userBean : userList) {
					if(userBean.getUser_id().equals(idText) && userBean.getUser_pwd().equals(pwdText)) {
						mainCard.show(mainPanel, "name_1364875108500");
						return;
					}
				}
			JOptionPane.showMessageDialog(null, "사용자 계정 정보가 잘못 되엇습니다.", "경고", JOptionPane.PLAIN_MESSAGE);
		
			}
		});
		loginButton.setBounds(507, 122, 97, 61);
		loginView.add(loginButton);
		
		JButton joinButton = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "name_1366014641600");
			}
		});
		joinButton.setBounds(353, 244, 97, 23);
		loginView.add(joinButton);
		
		JPanel homeView = new JPanel();
		mainPanel.add(homeView, "name_1364875108500");
		homeView.setLayout(null);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				idField.setText("");
				pwdField.setText("");
				loginUserBean = null;
				mainCard.show(mainPanel, "name_1332333502100");
			}
		});
		
		logoutButton.setBounds(682, 306, 97, 23);
		homeView.add(logoutButton);
	
		loginUserBean = null;
		
		welcomeMessage = new JLabel("New label");
		welcomeMessage.setBounds(25, 10, 164, 15);
		homeView.add(welcomeMessage);
		
		JPanel joinView = new JPanel();
		mainPanel.add(joinView, "name_1366014641600");
		joinView.setLayout(null);
		
		joinIdField = new JTextField();
		joinIdField.setBounds(294, 74, 164, 35);
		joinView.add(joinIdField);
		joinIdField.setColumns(10);
		
		joinNameField = new JTextField();
		joinNameField.setColumns(10);
		joinNameField.setBounds(294, 209, 259, 35);
		joinView.add(joinNameField);
		
		joinPhoneField = new JTextField();
		joinPhoneField.setColumns(10);
		joinPhoneField.setBounds(294, 254, 259, 35);
		joinView.add(joinPhoneField);
		
		joinPwdField = new JPasswordField();
		joinPwdField.setBounds(294, 119, 259, 35);
		joinView.add(joinPwdField);
		
		joinRePwdField = new JPasswordField();
		joinRePwdField.setBounds(294, 164, 259, 35);
		joinView.add(joinRePwdField);
		
		JLabel joinIdLable = new JLabel("\uC544\uC774\uB514");
		joinIdLable.setBounds(203, 83, 57, 15);
		joinView.add(joinIdLable);
		
		JLabel joinPwLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		joinPwLable.setBounds(203, 128, 57, 15);
		joinView.add(joinPwLable);
		
		JLabel joinRePwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		joinRePwdLable.setBounds(203, 173, 79, 15);
		joinView.add(joinRePwdLable);
		
		JLabel joinNameLable = new JLabel("\uC774\uB984");
		joinNameLable.setBounds(203, 218, 57, 15);
		joinView.add(joinNameLable);
		
		JLabel joinPhoneLable = new JLabel("\uC5F0\uB77D\uCC98");
		joinPhoneLable.setBounds(203, 263, 57, 15);
		joinView.add(joinPhoneLable);
		
		JLabel joinTitle = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		joinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		joinTitle.setFont(new Font("굴림", Font.BOLD, 30));
		joinTitle.setBounds(252, 10, 280, 54);
		joinView.add(joinTitle);
		
		JButton idCheckButton = new JButton("\uC911\uBCF5\uD655\uC778");
		idCheckButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				JoinMgrPool joinMgrPool = new JoinMgrPool();
				
				if(joinIdText.length() != 0) {
					if(joinMgrPool.idCheck(joinIdText)) {
						JOptionPane.showMessageDialog(null, "가입할 수 없는 아이디입니다.", "경고", JOptionPane.WARNING_MESSAGE);
						return;	
					}
					JOptionPane.showMessageDialog(null, joinIdText + "는 사용 가능한 아이디입니다.", "확인", JOptionPane.INFORMATION_MESSAGE);
					joinIdCheckFlag = true;
				}else {
					JOptionPane.showMessageDialog(null, "공백은 입력할 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		idCheckButton.setBounds(470, 80, 83, 23);
		joinView.add(idCheckButton);
		
		JButton joinSubmitButton = new JButton("\uAC00\uC785\uD558\uAE30");
		joinSubmitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String joinIdText = joinIdField.getText();
				String joinPwdText = joinPwdField.getText();
				String joinRePwdText = joinRePwdField.getText();
				String joinNameText = joinNameField.getText();
				String joinPhoneText = joinPhoneField.getText();
				if(joinIdCheckFlag == false) {
					JOptionPane.showMessageDialog(null, "아이디 중복확인이 되지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호는 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinRePwdText.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호 확인은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinNameText.length() == 0) {
					JOptionPane.showMessageDialog(null, "이름은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(joinPhoneText.length() == 0) {
					JOptionPane.showMessageDialog(null, "연락처은 공백일 수 없습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				}else if(!joinPwdText.equals(joinRePwdText)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다..", "경고", JOptionPane.WARNING_MESSAGE);	
				}else {
					UserBean userBean = new UserBean();
					userBean.setUser_id(joinIdText);
					userBean.setUser_pwd(joinRePwdText);
					userBean.setUser_name(joinNameText);
					userBean.setUser_phone(joinPhoneText);
					JoinMgrPool joinMgrPool = new JoinMgrPool();
					if(joinMgrPool.joinSubmit(userBean)) {
					joinIdField.setText("");
					joinPwdField.setText("");
					joinRePwdField.setText("");
					joinNameField.setText("");
					joinPhoneField.setText("");
					joinIdCheckFlag = false;
					JOptionPane.showMessageDialog(null, "축하합니다. 회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
					mainCard.show(mainPanel, "name_1359244071100");
				}else {JOptionPane.showMessageDialog(null, "DataBase에 정보를 추가하는 중에 오류가 발생하였습니다.", "DBExeption", JOptionPane.ERROR_MESSAGE);
				mainCard.show(mainPanel, "name_1359244071100");
					}
				}
			}
		});
		joinSubmitButton.setBounds(374, 299, 97, 23);
		joinView.add(joinSubmitButton);
		
		JPanel userInfo = new JPanel();
		mainPanel.add(userInfo, "name_10037517195900");
		userInfo.setLayout(null);
		
		JLabel updatePwLable = new JLabel("\uBE44\uBC00\uBC88\uD638");
		updatePwLable.setBounds(429, 85, 57, 15);
		userInfo.add(updatePwLable);
		
		updatePwText = new JPasswordField();
		updatePwText.setBounds(520, 76, 259, 35);
		userInfo.add(updatePwText);
		
		JLabel updateRePwdLable = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		updateRePwdLable.setBounds(429, 130, 79, 15);
		userInfo.add(updateRePwdLable);
		
		updatePwdText = new JPasswordField();
		updatePwdText.setBounds(520, 121, 259, 35);
		userInfo.add(updatePwdText);
		
		JLabel updateNameLable = new JLabel("\uC774\uB984");
		updateNameLable.setBounds(429, 175, 57, 15);
		userInfo.add(updateNameLable);
		
		updateNameText = new JTextField();
		updateNameText.setColumns(10);
		updateNameText.setBounds(520, 166, 259, 35);
		userInfo.add(updateNameText);
		
		JLabel updatePhoneLable = new JLabel("\uC5F0\uB77D\uCC98");
		updatePhoneLable.setBounds(429, 220, 57, 15);
		userInfo.add(updatePhoneLable);
		
		updatePhoneText = new JTextField();
		updatePhoneText.setColumns(10);
		updatePhoneText.setBounds(520, 211, 259, 35);
		userInfo.add(updatePhoneText);
		
		JLabel updateUserTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uC218\uC815");
		updateUserTitle.setFont(new Font("굴림", Font.BOLD, 18));
		updateUserTitle.setHorizontalAlignment(SwingConstants.CENTER);
		updateUserTitle.setBounds(564, 31, 127, 35);
		userInfo.add(updateUserTitle);
		
		JLabel UserInfoTitle = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		UserInfoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		UserInfoTitle.setFont(new Font("굴림", Font.BOLD, 18));
		UserInfoTitle.setBounds(127, 31, 127, 35);
		userInfo.add(UserInfoTitle);
		
		JLabel userInfoIdLable = new JLabel("\uC544\uC774\uB514");
		userInfoIdLable.setBounds(95, 85, 57, 15);
		userInfo.add(userInfoIdLable);
		
		JLabel userInfoPwLable = new JLabel("\uC774\uB984");
		userInfoPwLable.setBounds(95, 128, 57, 15);
		userInfo.add(userInfoPwLable);
		
		JLabel userInfoPhoneLable = new JLabel("\uC5F0\uB77D\uCC98");
		userInfoPhoneLable.setBounds(95, 173, 57, 15);
		userInfo.add(userInfoPhoneLable);
		
		JLabel userInfoId = new JLabel("New label");
		userInfoId.setBounds(153, 85, 57, 15);
		userInfo.add(userInfoId);
		
		JLabel userInfoName = new JLabel("New label");
		userInfoName.setBounds(153, 128, 57, 15);
		userInfo.add(userInfoName);
		
		JLabel userInfoPhone = new JLabel("New label");
		userInfoPhone.setBounds(153, 173, 57, 15);
		userInfo.add(userInfoPhone);
		
		JButton updateSubmitButton = new JButton("\uC218\uC815\uD558\uAE30");
		updateSubmitButton.setBounds(520, 266, 259, 23);
		userInfo.add(updateSubmitButton);
		
		JButton deleteSubmitButton = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		deleteSubmitButton.setBounds(95, 266, 259, 23);
		userInfo.add(deleteSubmitButton);
		
		JButton userInfoHomeButton = new JButton("\uBA54\uC778\uD654\uBA74");
		userInfoHomeButton.setBounds(682, 306, 97, 23);
		userInfo.add(userInfoHomeButton);
	}
}
