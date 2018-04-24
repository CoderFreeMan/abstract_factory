/**
 * 测试
 */
public class Main {

    public static void main(String[] args) {
        //男性工厂
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        //女性工厂
        HumanFactory femalHumanFactory = new FemaleHumanFactory();
        //男性工厂生产男性
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        //女性工厂生产女性
        Human femalYellowHuman = femalHumanFactory.createYellowHuman();

        maleYellowHuman.laugh();
        maleYellowHuman.talk();
        maleYellowHuman.sex();
        femalYellowHuman.laugh();
        femalYellowHuman.talk();
        femalYellowHuman.sex();
    }
}
