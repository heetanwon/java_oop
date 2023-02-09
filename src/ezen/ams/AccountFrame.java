package ezen.ams;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.Properties;

/**
 * 계좌 관리 애플리케이션 GUI
 * @author 김희원
 * @date  2023. 1. 16.
 */
public class AccountFrame extends Frame {
	
	AccountRepository repository;
	
	//textfield만 가중치 주고 button은 가중치 주지 x
	GridBagConstraints gridBagConstraints;
	Label receiveLabel, attachLabel, attachLabel2,  attachLabel3,  attachLabel4, attachLabel5, accountList;
	TextField receiveTF, attachTF, attachTF2,  attachTF3,  attachTF4, attachTF5;
	GridBagLayout griBagLayout;
	Button searchButton, searchButton2, searchButton3, searchButton4;
	Button delateButton;
	TextArea contentsArea;
	Panel buttonPanel;
	
	private static String fontName;
	private static int fontSize;

	static {
		Properties prop = new Properties();
		try {
			prop.load(AccountFrame.class.getResourceAsStream("config.properties"));
			fontName = prop.getProperty("font.family");
			fontSize =Integer.parseInt(prop.getProperty("font.size"));
			System.out.println(fontName);
			System.out.println(fontSize);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public AccountFrame(){
	  this("기본타이틀", null);
	}


	public AccountFrame(String title, AccountRepository repository){
		this.repository = repository;
		
		receiveLabel = new Label("계좌종류 ");
		receiveTF = new TextField();
		
		attachLabel = new Label("계좌번호");
		attachTF = new TextField();
		searchButton = new Button("조 회");
		delateButton = new Button("삭 제");
		
		attachLabel2 = new Label("예금주명");
		attachTF2 = new TextField();
		searchButton2 = new Button("검색");
		
		attachLabel3 = new Label("비밀번호");
		attachTF3 = new TextField();
		attachLabel4 = new Label("입금금액");
		attachTF4 = new TextField();
		
		attachLabel5 = new Label("대출금액");
		attachTF5 = new TextField();
		searchButton3 = new Button("신규등록");
		searchButton4 = new Button("전체조회");
		
		accountList = new Label("계좌목록");
		contentsArea = new TextArea();
		
		
		Font font = new Font(fontName, Font.BOLD , fontSize);
		receiveLabel.setFont(font);
		
		
		/*buttonPanel = new Panel();
		buttonPanel.add(sendButton);	
		buttonPanel.add(cancelButton);*/
		
		
	}	
	

	public void initLayout() {
		griBagLayout = new GridBagLayout();
		setLayout(griBagLayout);
		
		//계좌 종류
		add(receiveLabel, 0, 0, 1, 1, 0.0);
		add(receiveTF,    1, 0, 2, 1, 1.0);
		
		//계좌번호 조회 삭제
		add(attachLabel,  0, 1, 1, 1, 0.0);
		add(attachTF,     1, 1, 2, 1, 1.0);
		add(searchButton, 3, 1, 1, 1, 0.1);
		add(delateButton, 4, 1, 1, 1, 0.1);
		
		//예금주명 검색
		add(attachLabel2, 0, 2, 1, 1, 0.0);
		add(attachTF2,    1, 2, 2, 1, 1.0);
		add(searchButton2,3, 2, 1, 1, 0.1);
		
		//비밀번호 입금금액
		add(attachLabel3, 0, 3, 1, 1, 0.0);
		add(attachTF3,    1, 3, 2, 1, 1.0);
		add(attachLabel4 ,3, 3, 1, 1, 0.1);
		add(attachTF4,    4, 3, 2, 1, 1.0);
		
		//대출금액 신규등록 전체조회
		add(attachLabel5,  0, 4, 1, 1, 0.0);
		add(attachTF5,     1, 4, 2, 1, 1.0);
		add(searchButton3, 3, 4, 1, 1, 0.1);
		add(searchButton4, 4, 4, 1, 1, 0.1);
		
		//계좌목록 
		add(accountList,  0, 5, 1, 1, 0.0);
		
		//계좌목록 띄우는 곳
		add(contentsArea, 0, 6, 4, 4, 1.0);
		

		
		
		
		//가운데 정렬은 panel 이용
		/*add(buttonPanel, 0, 4, 4, 1, 1.0);*/
	}
	
		//GridBagLayout을 이용한 컴포넌트 배치
		private void add(Component component,int gridx, int gridy, int gridwidth, int gridheight, double weightx) {
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.fill = GridBagConstraints.BOTH;
			//html margin
			constraints.insets = new Insets(5, 5, 5, 5);
			constraints.weightx =weightx; // 가중치 
			//weight 데이터타입 double
			constraints.weighty = 0.0;
			constraints.gridx = gridx;
			constraints.gridy = gridy;
			constraints.gridwidth = gridwidth;
			//그리드 병합 수
			constraints.gridheight = gridheight;
			griBagLayout.setConstraints(component, constraints);
			add(component);
			
		}
		
		/*constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		gridBagLayout.setConstraints(button4, constraints);
		add(button4);*/

		
		
		
	
	
	public void addEventListener() {					
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				findByAccountNumber();
				
			}
		});
		
	}
	
	
	//계좌 조회 기능
	public void findByAccountNumber() {
	  String accountNum = attachTF.getText();
	  //데이터 유용성 검증 
	  //0이거나 공백
	  if(accountNum == null || accountNum.trim().length() == 0) {
		  System.out.println("계좌번호를 생략할 수 없습니다");
		  return;
	  }else {
		  Account account =  repository.findByNumber(accountNum);
		  if(account != null) {
			  contentsArea.append(account.toString() + "\n");
		  }else {
			  contentsArea.append("조회된 계좌가 존재하지 않습니다"); 
		  }
	  }
	}
		
	/*public static void main(String[] args) {
		AccountFrame frame5 = new AccountFrame("AWT 컴포넌트틀");
		frame5.initLayout();
		frame5.addEventListener();
		frame5.setSize(400,300);
		frame5.setVisible(true);
		
			
	}*/
	
	
}






