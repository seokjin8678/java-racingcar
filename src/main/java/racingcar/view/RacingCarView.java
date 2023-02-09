package racingcar.view;

import java.util.List;
import racingcar.dto.RacingCarNamesRequest;
import racingcar.dto.RacingCarStatusResponse;
import racingcar.dto.RacingCarWinnerResponse;
import racingcar.dto.TryCountRequest;

public interface RacingCarView {
    RacingCarNamesRequest receiveCarNames();
    TryCountRequest receiveTryCount();
    void printRacingResult(List<RacingCarStatusResponse> responses);
    void printWinners(RacingCarWinnerResponse response);
}