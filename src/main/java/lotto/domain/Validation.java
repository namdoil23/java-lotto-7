package lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validation {
    private void validateRange(List<Integer> numbers) {
        for (int number : numbers){

            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
    }

    private void validateDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        if (uniqueNumbers.size() != numbers.size()) {

            throw new IllegalArgumentException("[ERROR] 로또 번호는 중복될 수 없습니다.");
        }
    }

    private void validateBonus(List<Integer> bonusNumbers) {
        if (bonusNumbers.size() != 1) {

            throw new IllegalArgumentException("[ERROR] 보너스 번호는 1개여야 합니다.");
        }
    }

    private static void validateBonusRange(int bonusNumber) {
        if (bonusNumber < 1 || bonusNumber > 45) {

            throw new IllegalArgumentException("[ERROR] 보너스 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }

    private static void validateBonusDuplication(List<Integer> lottoNumbers, int bonusNumber) {
        if (lottoNumbers.contains(bonusNumber)) {

            throw new IllegalArgumentException("[ERROR] 보너스 번호는 당첨 번호와 중복될 수 없습니다.");
        }
    }

}

