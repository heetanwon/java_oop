package setget;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;

public class ChatPanel extends Panel {
	Panel connectPannel;
	Label nickNameLabel;
	TextField nickNameTF, inputTF;
	Button connectButton, sendButton;
	TextArea messagTA;
	Panel inputPanel;
	Choice userList; 
	
	
public ChatPanel(){
	connectPannel = new Panel();
	nickNameLabel = new Label("대화명 : "); //상단 왼쪽
    nickNameTF = new TextField("사용하고자 하는 대화명 입력"); //상단 가운데 
    inputTF = new TextField();
    connectButton = new Button("연    결"); //상단 오른쪽
    sendButton = new Button("보내기");
    messagTA = new TextArea();
	inputPanel = new Panel();
	userList = new Choice();
}	
	
//전반적인 구도 설정 
public void list() {
	setLayout(new BorderLayout());
	//제일 윗 부분 
	//객체 생성 
	connectPannel.setLayout(new BorderLayout());
	connectPannel.add(nickNameLabel, BorderLayout.WEST);	
	connectPannel.add(nickNameTF, BorderLayout.CENTER);	
	connectPannel.add(connectButton, BorderLayout.EAST);	
	//제일 아래 보내기 버튼 포함 
	//객체 생성 
	inputPanel.setLayout(new BorderLayout());
	inputPanel.add(inputTF, BorderLayout.CENTER);
	//오른쪽 대화 상대명 버튼
	inputPanel.add(sendButton, BorderLayout.EAST);
	
	//----구역 세부적으로 나누기 끝 -----
	
	//패널 개념으로 구역 나누기(조금 더 큰 개념)
	add(connectPannel, BorderLayout.NORTH);
	add(messagTA, BorderLayout.CENTER);
	add(userList, BorderLayout.EAST);
	add(inputPanel, BorderLayout.SOUTH);
	
	
	
	
}}


/*public void event() {
	
nickNameTF.addMouseListener(new MouseAdapter() {
	public void mousePressed() {};	
	
}
	
	
	
}


	
}*/
