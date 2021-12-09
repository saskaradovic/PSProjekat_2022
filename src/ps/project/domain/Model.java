/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps.project.domain;

/**
 *
 * @author saska
 */
public class Model {
    private Long modelId;
    private String modelName;//ime modela

    public Model() {
    }

    public Model(Long modelId, String modelName) {
        this.modelId = modelId;
        this.modelName = modelName;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return getModelName();
    }
   
    
    
}
