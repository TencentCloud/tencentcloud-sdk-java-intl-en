/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private TaskLabel [] Labels;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputInfo")
    @Expose
    private InputInfo InputInfo;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments [] AudioSegments;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorDescription")
    @Expose
    private String ErrorDescription;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskId 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskId 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataId 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataId 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BizType 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BizType 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Suggestion 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Labels 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TaskLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Labels 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(TaskLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InputInfo 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InputInfo 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInputInfo(InputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioText 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioText 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioSegments 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioSegments [] getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioSegments 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioSegments(AudioSegments [] AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrorType 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrorType 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrorDescription 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorDescription() {
        return this.ErrorDescription;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrorDescription 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Label 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Label 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailResponse(DescribeTaskDetailResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Labels != null) {
            this.Labels = new TaskLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TaskLabel(source.Labels[i]);
            }
        }
        if (source.InputInfo != null) {
            this.InputInfo = new InputInfo(source.InputInfo);
        }
        if (source.AudioText != null) {
            this.AudioText = new String(source.AudioText);
        }
        if (source.AudioSegments != null) {
            this.AudioSegments = new AudioSegments[source.AudioSegments.length];
            for (int i = 0; i < source.AudioSegments.length; i++) {
                this.AudioSegments[i] = new AudioSegments(source.AudioSegments[i]);
            }
        }
        if (source.ErrorType != null) {
            this.ErrorType = new String(source.ErrorType);
        }
        if (source.ErrorDescription != null) {
            this.ErrorDescription = new String(source.ErrorDescription);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "AudioText", this.AudioText);
        this.setParamArrayObj(map, prefix + "AudioSegments.", this.AudioSegments);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "ErrorDescription", this.ErrorDescription);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

