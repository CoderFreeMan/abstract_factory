/**
 * <p> Date             :2018/4/24 </p>
 * <p> Module           : </p>
 * <p> Description      : </p>
 * <p> Remark           : </p>
 *
 * @author yangdejun
 * @version 1.0
 * <p>--------------------------------------------------------------</p>
 * <p>修改历史</p>
 * <p>    序号    日期    修改人    修改原因    </p>
 * <p>    1                                     </p>
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑色人种会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种会说话");
    }

}
