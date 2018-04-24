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
public enum HumanEnum {
    YellowMaleHuman("YellowMaleHuman"),
    YellowFemaleHuman("YellowFemaleHuman"),
    WhiteFemaleHuman("WhiteFemaleHuman"),
    WhiteMaleHuman("WhiteMaleHuman"),
    BlackFemalHuman("BlackFemaleHuman"),
    BlackMaleHuman("BlackMaleHuman");
    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
