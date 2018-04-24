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
public abstract class AbstractHumanFactory implements HumanFactory {
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;
        if (!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return human;
    }
}
