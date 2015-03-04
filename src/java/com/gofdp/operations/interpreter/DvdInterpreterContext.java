package com.gofdp.operations.interpreter;

import java.util.ArrayList;

public class DvdInterpreterContext {
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<String> actors = new ArrayList<>();
    private ArrayList<TitleAndActor> titlesAndActors = new ArrayList<>();

    public void addTitle(String title) {
        titles.add(title);
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addTitleAndActor(TitleAndActor titleAndActor) {
        titlesAndActors.add(titleAndActor);
    }

    public ArrayList getAllTitles() {
        return titles;
    }

    public ArrayList getAllActors() {
        return actors;
    }

    public ArrayList<String> getActorsForTitle(String titleIn) {
        ArrayList<String> actorsForTitle = new ArrayList<>();
        for (TitleAndActor titlesAndActor : titlesAndActors) {
            if (titleIn.equals(titlesAndActor.getTitle())) {
                actorsForTitle.add(titlesAndActor.getActor());
            }
        }
        return actorsForTitle;
    }

    public ArrayList<String> getTitlesForActor(String actorIn) {
        ArrayList<String> titlesForActor = new ArrayList<>();
        for (TitleAndActor titlesAndActor : titlesAndActors) {
            if (actorIn.equals(titlesAndActor.getActor())) {
                titlesForActor.add(titlesAndActor.getTitle());
            }
        }
        return titlesForActor;
    }
}
