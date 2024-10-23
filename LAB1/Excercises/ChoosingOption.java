import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		Object[] options = {"I do", "I don't"};
		int option = JOptionPane.showOptionDialog(null,
				"Bao Phuc- Do you want to change to the first class ticket?",
				"Choose option",
				JOptionPane.YES_NO_OPTION,
		        JOptionPane.QUESTION_MESSAGE,
		        null,
				options,
				options[0]);
		
//		JOptionPane.showMessageDialog(null, "You've choosen: " 
//				+ (option==JOptionPane.YES_OPTION? "Yes" : "No"));
		
		//dùng message để thể hiện giá trị option
		String message;
        if (option == JOptionPane.YES_OPTION) {
            message = "Bao Phuc đã chọn: Có";
        } else if (option == JOptionPane.NO_OPTION) {
            message = "Bao Phuc đã chọn: Không";
        } else {
            message = "Bao Phuc đã không chọn.";
        }

        // Chỉ hiển thị thông báo nếu người dùng không chọn Hủy
        if (option != JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, message);
        }
		System.exit(0);
	}
}
