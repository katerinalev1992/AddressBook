package scenarioConfigurator;

/**
 * Created by klevytska on 13/03/2017.
 */
public class SceneConfiguration {

    private String dbConnection;
    private boolean isStoreSceneToGlobalDB;
    private boolean isRemoveSceneFromGlobalDB;
    private boolean isSelectSceneFromList;
    private int amountOfLoops;
    private boolean showSceneDoc;
    private int secondsBetweenSteps = 1000; // initial one second
    private String saveSceneTo;
    private String saveSceneName;

    public String getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(String dbConnection) {
        this.dbConnection = dbConnection;
    }

    public boolean isStoreSceneToGlobalDB() {
        return isStoreSceneToGlobalDB;
    }

    public void setStoreSceneToGlobalDB(boolean storeSceneToGlobalDB) {
        isStoreSceneToGlobalDB = storeSceneToGlobalDB;
    }

    public boolean isRemoveSceneFromGlobalDB() {
        return isRemoveSceneFromGlobalDB;
    }

    public void setRemoveSceneFromGlobalDB(boolean removeSceneFromGlobalDB) {
        isRemoveSceneFromGlobalDB = removeSceneFromGlobalDB;
    }

    public boolean isSelectSceneFromList() {
        return isSelectSceneFromList;
    }

    public void setSelectSceneFromList(boolean selectSceneFromList) {
        isSelectSceneFromList = selectSceneFromList;
    }

    public int getAmountOfLoops() {
        return amountOfLoops;
    }

    public void setAmountOfLoops(int amountOfLoops) {
        this.amountOfLoops = amountOfLoops;
    }

    public boolean isShowSceneDoc() {
        return showSceneDoc;
    }

    public void setShowSceneDoc(boolean showSceneDoc) {
        this.showSceneDoc = showSceneDoc;
    }

    public int getSecondsBetweenSteps() {
        return secondsBetweenSteps;
    }

    public void setSecondsBetweenSteps(int secondsBetweenSteps) {
        this.secondsBetweenSteps = secondsBetweenSteps;
    }

    public String getSaveSceneTo() {
        return saveSceneTo;
    }

    public void setSaveSceneTo(String saveSceneTo) {
        this.saveSceneTo = saveSceneTo;
    }

    public String getSaveSceneName() {
        return saveSceneName;
    }

    public void setSaveSceneName(String saveSceneName) {
        this.saveSceneName = saveSceneName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SceneConfiguration that = (SceneConfiguration) o;

        if (isStoreSceneToGlobalDB != that.isStoreSceneToGlobalDB) return false;
        if (isRemoveSceneFromGlobalDB != that.isRemoveSceneFromGlobalDB) return false;
        if (isSelectSceneFromList != that.isSelectSceneFromList) return false;
        if (amountOfLoops != that.amountOfLoops) return false;
        if (showSceneDoc != that.showSceneDoc) return false;
        if (secondsBetweenSteps != that.secondsBetweenSteps) return false;
        if (dbConnection != null ? !dbConnection.equals(that.dbConnection) : that.dbConnection != null) return false;
        if (saveSceneTo != null ? !saveSceneTo.equals(that.saveSceneTo) : that.saveSceneTo != null) return false;
        return saveSceneName != null ? saveSceneName.equals(that.saveSceneName) : that.saveSceneName == null;
    }

    @Override
    public int hashCode() {
        int result = dbConnection != null ? dbConnection.hashCode() : 0;
        result = 31 * result + (isStoreSceneToGlobalDB ? 1 : 0);
        result = 31 * result + (isRemoveSceneFromGlobalDB ? 1 : 0);
        result = 31 * result + (isSelectSceneFromList ? 1 : 0);
        result = 31 * result + amountOfLoops;
        result = 31 * result + (showSceneDoc ? 1 : 0);
        result = 31 * result + secondsBetweenSteps;
        result = 31 * result + (saveSceneTo != null ? saveSceneTo.hashCode() : 0);
        result = 31 * result + (saveSceneName != null ? saveSceneName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SceneConfiguration{" +
                "dbConnection='" + dbConnection + '\'' +
                ", isStoreSceneToGlobalDB=" + isStoreSceneToGlobalDB +
                ", isRemoveSceneFromGlobalDB=" + isRemoveSceneFromGlobalDB +
                ", isSelectSceneFromList=" + isSelectSceneFromList +
                ", amountOfLoops=" + amountOfLoops +
                ", showSceneDoc=" + showSceneDoc +
                ", secondsBetweenSteps=" + secondsBetweenSteps +
                ", saveSceneTo='" + saveSceneTo + '\'' +
                ", saveSceneName='" + saveSceneName + '\'' +
                '}';
    }
}
