package kr.codesquad.view;

import kr.codesquad.domain.LadderGame;


public class Client {
    public void startGame(){
        InputLadder input = new InputLadder();
        LadderGame ladderGame = new LadderGame();
        ladderGame.start(input.inputPlayers(),input.inputResult(),input.inputRow());
        String id = input.inputSearch();
        ladderGame.searchResult(id);
    }
}
