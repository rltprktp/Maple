import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Simulator extends JFrame {

	// key   캐릭터 레벨
	// value 캐릭터 경험치양
	HashMap<Integer, Double> Exp = new HashMap<Integer, Double>();

	private JLabel lbl209; // 성장의 비약1 이름
	private JButton btn209; // 성장의 비약1 버튼

	private JLabel lbl219; // 성장의 비약2 이름
	private JButton btn219; // 성장의 비약2 버튼

	private JLabel lbl229; // 성장의 비약3 이름
	private JButton btn229; // 성장의 비약3 버튼

	private JLabel lbl239; // 태풍 성장의 비약 이름
	private JButton btn239; // 태풍 성장의 비약 버튼

	private JLabel lbl249; // 극한 성장의 비약 이름
	private JButton btn249; // 극한 성장의 비약 버튼

	private JLabel lblCurrentLevel; // 현재 레벨 이름
	private JLabel lblCurrentNum; // 현재 레벨 숫자

	private JLabel lblexp; // 현재 경험치 이름
	private JLabel lblexpNum; // 현재 경험치 숫자
	private JLabel lblexpPer; // 퍼센트

	private JButton btnReset; // 리셋 버튼
	
	private ImageIcon icon;
	private ImageIcon changeIcon;
	private Image img;
	private Image changeImg;


	private int str_i = 0;
	private double d_three = 0L;
	private double str_d = 0L;
	private String i_str = "";
	private String d_str = "";

	private int level = 0;
	private double exp = 0L;
	private double percent = 0L;
	private double changeExp = 0L;

	private double exp209 = 6120258214L; // 201 ~ 209 성장의 비약
	private double exp219 = 22164317197L; // 211 ~ 219 성장의 비약
	private double exp229 = 64359295696L; // 221 ~ 229 성장의 비약
	private double exp239 = 137783047111L; // 231 ~ 239 성장의 비약
	private double exp249 = 294971656640L; // 241 ~ 249 성장의 비약

	Font font;

	public void init() {
		Exp.put(200, (double) 2207026470L);
		Exp.put(201, (double) 2471869646L);
		Exp.put(202, (double) 2768494003L);
		Exp.put(203, (double) 3100713283L);
		Exp.put(204, (double) 3472798876L);
		Exp.put(205, (double) 3889534741L);
		Exp.put(206, (double) 4356278909L);
		Exp.put(207, (double) 4879032378L);
		Exp.put(208, (double) 5464516263L);
		Exp.put(209, (double) 6120258214L);
		Exp.put(210, (double) 7956335678L);
		Exp.put(211, (double) 8831532602L);
		Exp.put(212, (double) 9803001188L);
		Exp.put(213, (double) 10881331318L);
		Exp.put(214, (double) 12078277762L);
		Exp.put(215, (double) 15701761090L);
		Exp.put(216, (double) 17114919588L);
		Exp.put(217, (double) 18655262350L);
		Exp.put(218, (double) 20334235961L);
		Exp.put(219, (double) 22164317197L);
		Exp.put(220, (double) 28813612356L);
		Exp.put(221, (double) 30830565220L);
		Exp.put(222, (double) 32988704785L);
		Exp.put(223, (double) 35297914119L);
		Exp.put(224, (double) 37768768107L);
		Exp.put(225, (double) 49099398539L);
		Exp.put(226, (double) 52536356436L);
		Exp.put(227, (double) 56213901386L);
		Exp.put(228, (double) 60148874483L);
		Exp.put(229, (double) 64359295696L);
		Exp.put(230, (double) 83667084404L);
		Exp.put(231, (double) 86177096936L);
		Exp.put(232, (double) 88762409844L);
		Exp.put(233, (double) 91425282139L);
		Exp.put(234, (double) 94168040603L);
		Exp.put(235, (double) 122418452783L);
		Exp.put(236, (double) 126091006366L);
		Exp.put(237, (double) 129873736556L);
		Exp.put(238, (double) 133769948652L);
		Exp.put(239, (double) 137783047111L);
		Exp.put(240, (double) 179117961244L);
		Exp.put(241, (double) 184491500081L);
		Exp.put(242, (double) 190026245083L);
		Exp.put(243, (double) 195727032435L);
		Exp.put(244, (double) 201598843408L);
		Exp.put(245, (double) 262078496430L);
		Exp.put(246, (double) 269940851322L);
		Exp.put(247, (double) 278039076861L);
		Exp.put(248, (double) 286380249166L);
		Exp.put(249, (double) 294971656640L);
		Exp.put(250, (double) 442457484960L);
		Exp.put(251, (double) 455731209508L);
	}

	// 문자열을 숫자로
	public void changeStringInt(String s) {
		str_i = Integer.parseInt(s);
	}

	// 문자열을 실수로
	public void changeStringDouble(String s) {
		str_d = Double.parseDouble(s);
	}

	// 정수를 문자열로
	public void changeIntString(int s) {
		i_str = Integer.toString(s);
	}

	// 실수를 문자열로
	public void changeDoubleString(Double s) {
		d_str = Double.toString(s);
	}

	// 실수 셋째 자리
	public void changeDoubleThree(Double s) {
		d_three = Math.round(s * 1000) / 1000.0;
	}
	
	public void btnImg(JButton btn, String s) {
		icon = new ImageIcon(s);
		img = icon.getImage();
		changeImg = img.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		btn = new JButton(changeIcon);
		btn.setPreferredSize(new Dimension(15, 15));
	}

	public Simulator() {
		init();
		showFrame();
	}
	
	public void imgInsert(int i, JButton btn) {
		icon = new ImageIcon("img/"+i+".jpg");
		img = icon.getImage();
		changeImg = img.getScaledInstance(39, 39, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
	}

	private void showFrame() {
		font = new Font("맑은 고딕", Font.BOLD, 30);
		lbl209 = new JLabel("성장의 비약 1");
		btn209 = new JButton();
		lbl219 = new JLabel("성장의 비약 2");
		btn219 = new JButton();
		lbl229 = new JLabel("성장의 비약 3");
		btn229 = new JButton();
		lbl239 = new JLabel("태풍 성장의 비약");
		btn239 = new JButton();
		lbl249 = new JLabel("극한 성장의 비약");
		btn249 = new JButton();

		imgInsert(209, btn209);
		btn209 = new JButton(changeIcon);
		btn209.setPreferredSize(new Dimension(40,15));
		btn209.setToolTipText("200레벨 이상의 캐릭터만 사용이 가능하며 200~209레벨이 사용 시 1레벨 성장, 210 레벨 이상은 상당량의 경험치를 얻는다.");

		imgInsert(219, btn219);
		btn219 = new JButton(changeIcon);
		btn219.setPreferredSize(new Dimension(40,15));
		btn219.setToolTipText("200레벨 이상의 캐릭터만 사용이 가능하며 200~219레벨이 사용 시 1레벨 성장, 220 레벨 이상은 상당량의 경험치를 얻는다.");

		imgInsert(229, btn229);
		btn229 = new JButton(changeIcon);
		btn229.setPreferredSize(new Dimension(40,15));
		btn229.setToolTipText("200레벨 이상의 캐릭터만 사용이 가능하며 200~229레벨이 사용 시 1레벨 성장, 230 레벨 이상은 상당량의 경험치를 얻는다.");

		imgInsert(239, btn239);
		btn239 = new JButton(changeIcon);
		btn239.setPreferredSize(new Dimension(40,15));
		btn239.setToolTipText("200레벨 이상의 캐릭터만 사용이 가능하며 200~239레벨이 사용 시 1레벨 성장, 240 레벨 이상은 상당량의 경험치를 얻는다.");

		imgInsert(249, btn249);
		btn249 = new JButton(changeIcon);
		btn249.setPreferredSize(new Dimension(40,15));
		btn249.setToolTipText("200레벨 이상의 캐릭터만 사용이 가능하며 200~249레벨이 사용 시 1레벨 성장, 250 레벨 이상은 상당량의 경험치를 얻는다.");

		lblCurrentLevel = new JLabel("레벨");
		lblCurrentNum = new JLabel("200");

		lblexp = new JLabel("경험치");
		lblexpNum = new JLabel("0");
		lblexpPer = new JLabel("%");

		btnReset = new JButton("리셋");

		icon = new ImageIcon("img/reset.jpg");
		img = icon.getImage();
		changeImg = img.getScaledInstance(39, 39, Image.SCALE_SMOOTH);
		changeIcon = new ImageIcon(changeImg);
		btnReset = new JButton(changeIcon);
		btnReset.setPreferredSize(new Dimension(40,40));

		// 상단(왼쪽) 부분 패널 " 현재 레벨 "
		JPanel pnlInNorthLeft = new JPanel();
		pnlInNorthLeft.add(lblCurrentLevel, BorderLayout.WEST);
		pnlInNorthLeft.add(lblCurrentNum, BorderLayout.EAST);
		pnlInNorthLeft.setBackground(Color.WHITE);

		// 상단(오른쪽) 부분 패널 " 현재 레벨에 따른 경험치 "
		JPanel pnlInNorthRight = new JPanel();
		pnlInNorthRight.add(lblexp, BorderLayout.WEST);
		pnlInNorthRight.add(lblexpNum, BorderLayout.CENTER);
		pnlInNorthRight.add(lblexpPer, BorderLayout.EAST);
		pnlInNorthRight.setBackground(Color.WHITE);

		// 상단 부분 패널
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(pnlInNorthLeft);
		pnlNorth.add(pnlInNorthRight);
		pnlNorth.setBorder(new TitledBorder("Level"));
		pnlNorth.setBackground(Color.WHITE);

		// 중단 왼쪽 JLabel 패널
		JPanel pnlCenterlbl = new JPanel(new GridLayout(0,1));
		pnlCenterlbl.add(lbl209);
		pnlCenterlbl.add(lbl219);
		pnlCenterlbl.add(lbl229);
		pnlCenterlbl.add(lbl239);
		pnlCenterlbl.add(lbl249);
		pnlCenterlbl.setBackground(Color.WHITE);

		// 중단 오른쪽 JButton 패널
		JPanel pnlCenterbtn = new JPanel(new GridLayout(0,1));
		pnlCenterbtn.add(btn209);
		pnlCenterbtn.add(btn219);
		pnlCenterbtn.add(btn229);
		pnlCenterbtn.add(btn239);
		pnlCenterbtn.add(btn249);
		pnlCenterbtn.setBackground(Color.WHITE);

		// 중단 부분 패널
		JPanel pnlCenter = new JPanel(new BorderLayout());
		pnlCenter.add(pnlCenterlbl, BorderLayout.WEST);
		pnlCenter.add(pnlCenterbtn, BorderLayout.EAST);
		pnlCenter.setBorder(new TitledBorder("Exp"));
		pnlCenter.setBackground(Color.WHITE);

		// 하단 "리셋" 버튼 패널
		JPanel pnlSouth = new JPanel();
		pnlSouth.add(btnReset);
		pnlSouth.setBackground(Color.WHITE);

		// 전체 패널
		JPanel pnlMain = new JPanel(new BorderLayout());
		pnlMain.add(pnlNorth, BorderLayout.NORTH);
		pnlMain.add(pnlCenter, BorderLayout.CENTER);
		pnlMain.add(pnlSouth, BorderLayout.SOUTH);

		add(pnlMain);

		// 209 비약을 클릭시에 210 미만의 레벨은 무조건 1업이 상승 되어야 하며
		// 210 레벨부터는 209에 해당하는 경험치가 상승해야만 한다.
		btn209.addActionListener((e) -> {
			// 현재 레벨값을 숫자로 변환 (문자 -> 정수)
			changeStringInt(lblCurrentNum.getText());
			// 현재 경험치를 숫자로 변환 (문자 -> 실수)
			changeStringDouble(lblexpNum.getText());
			level = str_i;
			percent = str_d;

			// 현재 레벨이 210보다 작다면 1업
			if (level < 210) {
				level++;
				changeIntString(level);
				lblCurrentNum.setText(i_str);
				// 현재 레벨이 210 이상이라면 209에 해당하는 경험치를 상승
			} else {
				exp += exp209;
				// 209에 해당하는 경험치가 상승했을 때 현재 레벨의 경험치양을 초과한다면 1업을 한다.
				if (exp >= Exp.get(level)) {
					exp -= Exp.get(level);
					level++;
					changeIntString(level);
					lblCurrentNum.setText(i_str);
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				} else {
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				}
			}
		});

		btn219.addActionListener((e) -> {
			changeStringInt(lblCurrentNum.getText());
			changeStringDouble(lblexpNum.getText());
			level = str_i;
			percent = str_d;

			// 현재 레벨이 220보다 작다면 1업
			if (level < 220) {
				level++;
				changeIntString(level);
				lblCurrentNum.setText(i_str);
				percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
				changeDoubleString(percent);
				lblexpNum.setText(d_str);
			} else {
				exp += exp219;
				if (exp >= Exp.get(level)) {
					exp -= Exp.get(level);
					level++;
					changeIntString(level);
					lblCurrentNum.setText(i_str);
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				} else {
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				}
			}
		});
		btn229.addActionListener((e) -> {
			changeStringInt(lblCurrentNum.getText());
			changeStringDouble(lblexpNum.getText());
			level = str_i;
			percent = str_d;

			// 현재 레벨이 230보다 작다면 1업
			if (level < 230) {
				level++;
				changeIntString(level);
				lblCurrentNum.setText(i_str);
				percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
				changeDoubleString(percent);
				lblexpNum.setText(d_str);
			} else {
				exp += exp229;
				if (exp >= Exp.get(level)) {
					exp -= Exp.get(level);
					level++;
					changeIntString(level);
					lblCurrentNum.setText(i_str);
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				} else {
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				}
			}
		});
		btn239.addActionListener((e) -> {
			changeStringInt(lblCurrentNum.getText());
			changeStringDouble(lblexpNum.getText());
			level = str_i;
			percent = str_d;

			// 현재 레벨이 240보다 작다면 1업
			if (level < 240) {
				level++;
				changeIntString(level);
				lblCurrentNum.setText(i_str);
				percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
				changeDoubleString(percent);
				lblexpNum.setText(d_str);
			} else {
				exp += exp239;
				if (exp >= Exp.get(level)) {
					exp -= Exp.get(level);
					level++;
					changeIntString(level);
					lblCurrentNum.setText(i_str);
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				} else {
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				}
			}
		});

		btn249.addActionListener((e) -> {
			changeStringInt(lblCurrentNum.getText());
			changeStringDouble(lblexpNum.getText());
			level = str_i;
			percent = str_d;

			// 현재 레벨이 250보다 작다면 1업
			if (level < 250) {
				level++;
				changeIntString(level);
				lblCurrentNum.setText(i_str);
				percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
				changeDoubleString(percent);
				lblexpNum.setText(d_str);
			} else {
				exp += exp249;
				if (exp >= Exp.get(level)) {
					exp -= Exp.get(level);
					level++;
					changeIntString(level);
					lblCurrentNum.setText(i_str);
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				} else {
					percent = (Math.round(exp / Exp.get(level) * 100000) / 1000.0);
					changeDoubleString(percent);
					lblexpNum.setText(d_str);
				}
			}
		});

		btnReset.addActionListener((e) -> {
			new Simulator();
		});

		setTitle("메이플 성장의 비약 시뮬레이터");
		setSize(230, 360);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false); // 창을 고정
		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new Simulator();
	}
}
