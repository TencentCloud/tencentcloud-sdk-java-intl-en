/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelInfo extends AbstractModel {

    /**
    * The model version ID is returned by the DescribeTrainingModelVersion API when querying the model.Enter the task ID of the Automated Machine Learning (AutoML) model.
    */
    @SerializedName("ModelVersionId")
    @Expose
    private String ModelVersionId;

    /**
    * Model ID.
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Model name.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Model version.
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * Model source.
    */
    @SerializedName("ModelSource")
    @Expose
    private String ModelSource;

    /**
    * COS path information.
    */
    @SerializedName("CosPathInfo")
    @Expose
    private CosPathInfo CosPathInfo;

    /**
    * GooseFSx configurations, and is valid when ModelSource is GooseFSx.
    */
    @SerializedName("GooseFSx")
    @Expose
    private GooseFSx GooseFSx;

    /**
    * Algorithm framework corresponding to the model (reserved field).Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * Default: NORMAL; accelerated model: ACCELERATE; automatic learning model: AUTO_ML.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * Model format.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * Whether it is a private LLM.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPrivateModel")
    @Expose
    private Boolean IsPrivateModel;

    /**
    * Model category. Valid values: MultiModal (multi-modal) and LLM (text LLM).
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * Data source configurations.
    */
    @SerializedName("PublicDataSource")
    @Expose
    private PublicDataSourceFS PublicDataSource;

    /**
     * Get The model version ID is returned by the DescribeTrainingModelVersion API when querying the model.Enter the task ID of the Automated Machine Learning (AutoML) model. 
     * @return ModelVersionId The model version ID is returned by the DescribeTrainingModelVersion API when querying the model.Enter the task ID of the Automated Machine Learning (AutoML) model.
     */
    public String getModelVersionId() {
        return this.ModelVersionId;
    }

    /**
     * Set The model version ID is returned by the DescribeTrainingModelVersion API when querying the model.Enter the task ID of the Automated Machine Learning (AutoML) model.
     * @param ModelVersionId The model version ID is returned by the DescribeTrainingModelVersion API when querying the model.Enter the task ID of the Automated Machine Learning (AutoML) model.
     */
    public void setModelVersionId(String ModelVersionId) {
        this.ModelVersionId = ModelVersionId;
    }

    /**
     * Get Model ID. 
     * @return ModelId Model ID.
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set Model ID.
     * @param ModelId Model ID.
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Model name. 
     * @return ModelName Model name.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model name.
     * @param ModelName Model name.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Model version. 
     * @return ModelVersion Model version.
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set Model version.
     * @param ModelVersion Model version.
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get Model source. 
     * @return ModelSource Model source.
     */
    public String getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set Model source.
     * @param ModelSource Model source.
     */
    public void setModelSource(String ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get COS path information. 
     * @return CosPathInfo COS path information.
     */
    public CosPathInfo getCosPathInfo() {
        return this.CosPathInfo;
    }

    /**
     * Set COS path information.
     * @param CosPathInfo COS path information.
     */
    public void setCosPathInfo(CosPathInfo CosPathInfo) {
        this.CosPathInfo = CosPathInfo;
    }

    /**
     * Get GooseFSx configurations, and is valid when ModelSource is GooseFSx. 
     * @return GooseFSx GooseFSx configurations, and is valid when ModelSource is GooseFSx.
     */
    public GooseFSx getGooseFSx() {
        return this.GooseFSx;
    }

    /**
     * Set GooseFSx configurations, and is valid when ModelSource is GooseFSx.
     * @param GooseFSx GooseFSx configurations, and is valid when ModelSource is GooseFSx.
     */
    public void setGooseFSx(GooseFSx GooseFSx) {
        this.GooseFSx = GooseFSx;
    }

    /**
     * Get Algorithm framework corresponding to the model (reserved field).Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlgorithmFramework Algorithm framework corresponding to the model (reserved field).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set Algorithm framework corresponding to the model (reserved field).Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlgorithmFramework Algorithm framework corresponding to the model (reserved field).Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlgorithmFramework(String AlgorithmFramework) {
        this.AlgorithmFramework = AlgorithmFramework;
    }

    /**
     * Get Default: NORMAL; accelerated model: ACCELERATE; automatic learning model: AUTO_ML.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModelType Default: NORMAL; accelerated model: ACCELERATE; automatic learning model: AUTO_ML.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set Default: NORMAL; accelerated model: ACCELERATE; automatic learning model: AUTO_ML.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModelType Default: NORMAL; accelerated model: ACCELERATE; automatic learning model: AUTO_ML.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get Model format.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModelFormat Model format.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set Model format.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModelFormat Model format.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    /**
     * Get Whether it is a private LLM.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPrivateModel Whether it is a private LLM.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPrivateModel() {
        return this.IsPrivateModel;
    }

    /**
     * Set Whether it is a private LLM.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPrivateModel Whether it is a private LLM.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPrivateModel(Boolean IsPrivateModel) {
        this.IsPrivateModel = IsPrivateModel;
    }

    /**
     * Get Model category. Valid values: MultiModal (multi-modal) and LLM (text LLM). 
     * @return ModelCategory Model category. Valid values: MultiModal (multi-modal) and LLM (text LLM).
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set Model category. Valid values: MultiModal (multi-modal) and LLM (text LLM).
     * @param ModelCategory Model category. Valid values: MultiModal (multi-modal) and LLM (text LLM).
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get Data source configurations. 
     * @return PublicDataSource Data source configurations.
     */
    public PublicDataSourceFS getPublicDataSource() {
        return this.PublicDataSource;
    }

    /**
     * Set Data source configurations.
     * @param PublicDataSource Data source configurations.
     */
    public void setPublicDataSource(PublicDataSourceFS PublicDataSource) {
        this.PublicDataSource = PublicDataSource;
    }

    public ModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInfo(ModelInfo source) {
        if (source.ModelVersionId != null) {
            this.ModelVersionId = new String(source.ModelVersionId);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.ModelSource != null) {
            this.ModelSource = new String(source.ModelSource);
        }
        if (source.CosPathInfo != null) {
            this.CosPathInfo = new CosPathInfo(source.CosPathInfo);
        }
        if (source.GooseFSx != null) {
            this.GooseFSx = new GooseFSx(source.GooseFSx);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.ModelFormat != null) {
            this.ModelFormat = new String(source.ModelFormat);
        }
        if (source.IsPrivateModel != null) {
            this.IsPrivateModel = new Boolean(source.IsPrivateModel);
        }
        if (source.ModelCategory != null) {
            this.ModelCategory = new String(source.ModelCategory);
        }
        if (source.PublicDataSource != null) {
            this.PublicDataSource = new PublicDataSourceFS(source.PublicDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelVersionId", this.ModelVersionId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "ModelSource", this.ModelSource);
        this.setParamObj(map, prefix + "CosPathInfo.", this.CosPathInfo);
        this.setParamObj(map, prefix + "GooseFSx.", this.GooseFSx);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamSimple(map, prefix + "IsPrivateModel", this.IsPrivateModel);
        this.setParamSimple(map, prefix + "ModelCategory", this.ModelCategory);
        this.setParamObj(map, prefix + "PublicDataSource.", this.PublicDataSource);

    }
}

