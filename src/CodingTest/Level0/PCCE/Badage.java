package CodingTest.Level0.PCCE;
/*
어떤 게임에는 붕대 감기라는 기술이 있습니다.
붕대 감기는 t초 동안 붕대를 감으면서 1초마다 x만큼의 체력을 회복합니다. t초 연속으로 붕대를 감는 데 성공한다면 y만큼의 체력을 추가로 회복합니다.
게임 캐릭터에는 최대 체력이 존재해 현재 체력이 최대 체력보다 커지는 것은 불가능합니다.
기술을 쓰는 도중 몬스터에게 공격을 당하면 기술이 취소되고, 공격을 당하는 순간에는 체력을 회복할 수 없습니다. 몬스터에게 공격당해 기술이 취소당하거나
기술이 끝나면 그 즉시 붕대 감기를 다시 사용하며, 연속 성공 시간이 0으로 초기화됩니다.
몬스터의 공격을 받으면 정해진 피해량만큼 현재 체력이 줄어듭니다. 이때, 현재 체력이 0 이하가 되면 캐릭터가 죽으며 더 이상 체력을 회복할 수 없습니다.
당신은 붕대감기 기술의 정보, 캐릭터가 가진 최대 체력과 몬스터의 공격 패턴이 주어질 때 캐릭터가 끝까지 생존할 수 있는지 궁금합니다.
붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열 bandage와 최대 체력을 의미하는 정수 health,
몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열 attacks가 매개변수로 주어집니다. 모든 공격이 끝난 직후 남은 체력을 return 하도록 solution 함수를 완성해 주세요.
만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요.
 */
public class Badage {
    // bandage : {붕대감기기술의 시전시간, 1초당 회복량, 추가 회복량}, health : 최대 체력, attacks : 몬스터의 공격 시간과 피해량 2차원 배열
    public static void main(String[] args) {
        Badage badage = new Badage();
        int[] bandage = {3,3,3};
        int health = 100;
        int[][] attacks = {{1,3},{5,5},{10,20},{3,11}};
        System.out.println(
        badage.solution(bandage, health, attacks)
        );
    }
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int enermyAttakTime = attacks.length;
        int enermyAttacking = attacks[0].length;
        int maxTime = 0;
        for(int i = 0; i<enermyAttakTime; i++){
          for(int j = 0; j<enermyAttacking; j++){
              if(j==0){
                  maxTime = attacks[0][0];
              }
              if(j!= 0 && attacks[0][j] > attacks[0][j-1]){
                  System.out.println(attacks[0][j]);
                  maxTime = attacks[0][j];
              }
              health = attackCharacter(health,attacks[1][j]);
            }
        }
        System.out.println(maxTime);
        // 모든 공격 끝난 직후 남은 체력, 체력이 0이하가 되면 -1
        answer = health;
        return answer;
    }

    public int attackCharacter (int health, int damage){
        health -= damage;
        return health;
    }

    public int healCharacter (int health, int heal){
        health += heal;
        return  health;
    }
}
