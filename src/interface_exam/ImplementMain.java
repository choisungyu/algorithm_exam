package interface_exam;

public class ImplementMain implements MainFragment.OnClickListener{
    public static void main(String[] args) {

        // implementMain이 OnclickListener의 메소드랑 같이 가져옴
        ImplementMain implementMain = new ImplementMain();
        // fragment에 mListener를 연결
        MainFragment fragment = new MainFragment();
        //<- 담긴메소드를 fragment에 연결
        fragment.mListener = implementMain;
        // fragment에 클릭메소드를 연결해서
        fragment.click();
    }

    @Override
    public int onClick() {
        return 0;
    }
}

class MainFragment {
    interface OnClickListener {
        int onClick();
    }

    OnClickListener mListener;

    public void click() {
        System.out.println("MainFragment : " + mListener.onClick());
    }
}
