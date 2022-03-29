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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel{

    /**
    * This field is used to return the task ID (in the `Results` parameter) after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * This field is used to return the data ID parameter passed in within the `Tasks` parameter when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * This field is used to return the `BizType` parameter passed in when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * This field is used to return the task name in the `TaskInput` parameter passed in when the audio moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * This field is used to return the task status of the queried content.
<br>Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * This field is used to return the audio moderation type passed in when the audio moderation API is called. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * This field is used to return the operation suggestion for the maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private TaskLabel [] Labels;

    /**
    * This field is used to return the media content information of the moderation service, mainly including the input file type and access URL.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputInfo")
    @Expose
    private InputInfo InputInfo;

    /**
    * This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * This field is used to return the moderation result of an audio segment, mainly including the start time and audio moderation result.<br>For the specific output content, see the detailed description of the `AudioSegments` and `AudioResult` data structures.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments [] AudioSegments;

    /**
    * If the task status is `Error`, this field will return the error type; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * If the task status is `Error`, this field will return the error message; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorDescription")
    @Expose
    private String ErrorDescription;

    /**
    * This field is used to return the creation time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * This field is used to return the last update time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get This field is used to return the task ID (in the `Results` parameter) after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskId This field is used to return the task ID (in the `Results` parameter) after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set This field is used to return the task ID (in the `Results` parameter) after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskId This field is used to return the task ID (in the `Results` parameter) after an audio moderation task is created. It is used to identify the moderation task for which to query the details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get This field is used to return the data ID parameter passed in within the `Tasks` parameter when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataId This field is used to return the data ID parameter passed in within the `Tasks` parameter when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set This field is used to return the data ID parameter passed in within the `Tasks` parameter when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataId This field is used to return the data ID parameter passed in within the `Tasks` parameter when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get This field is used to return the `BizType` parameter passed in when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BizType This field is used to return the `BizType` parameter passed in when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set This field is used to return the `BizType` parameter passed in when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BizType This field is used to return the `BizType` parameter passed in when the audio moderation API is called for easier data identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get This field is used to return the task name in the `TaskInput` parameter passed in when the audio moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name This field is used to return the task name in the `TaskInput` parameter passed in when the audio moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set This field is used to return the task name in the `TaskInput` parameter passed in when the audio moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name This field is used to return the task name in the `TaskInput` parameter passed in when the audio moderation API is called for easier task identification and management.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get This field is used to return the task status of the queried content.
<br>Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status This field is used to return the task status of the queried content.
<br>Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set This field is used to return the task status of the queried content.
<br>Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status This field is used to return the task status of the queried content.
<br>Valid values: **FINISH** (task completed), **PENDING** (task pending), **RUNNING** (task in progress), **ERROR** (task error), **CANCELLED** (task canceled).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get This field is used to return the audio moderation type passed in when the audio moderation API is called. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type This field is used to return the audio moderation type passed in when the audio moderation API is called. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set This field is used to return the audio moderation type passed in when the audio moderation API is called. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type This field is used to return the audio moderation type passed in when the audio moderation API is called. Valid values: **AUDIO** (audio on demand), **LIVE_AUDIO** (audio live streaming). Default value: AUDIO.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get This field is used to return the operation suggestion for the maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion This field is used to return the operation suggestion for the maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to return the operation suggestion for the maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Suggestion This field is used to return the operation suggestion for the maliciousness tag. When you get the determination result, the returned value indicates the operation suggested by the system. We recommend you handle different types of violations and suggestions according to your business needs. <br>Returned values: **Block**, **Review**, **Pass**.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Labels This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TaskLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Labels This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(TaskLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get This field is used to return the media content information of the moderation service, mainly including the input file type and access URL.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InputInfo This field is used to return the media content information of the moderation service, mainly including the input file type and access URL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set This field is used to return the media content information of the moderation service, mainly including the input file type and access URL.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InputInfo This field is used to return the media content information of the moderation service, mainly including the input file type and access URL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInputInfo(InputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioText This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioText This field is used to return the recognized text content of an audio file. **Up to the first 1,000 characters** can be recognized.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get This field is used to return the moderation result of an audio segment, mainly including the start time and audio moderation result.<br>For the specific output content, see the detailed description of the `AudioSegments` and `AudioResult` data structures.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioSegments This field is used to return the moderation result of an audio segment, mainly including the start time and audio moderation result.<br>For the specific output content, see the detailed description of the `AudioSegments` and `AudioResult` data structures.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioSegments [] getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set This field is used to return the moderation result of an audio segment, mainly including the start time and audio moderation result.<br>For the specific output content, see the detailed description of the `AudioSegments` and `AudioResult` data structures.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioSegments This field is used to return the moderation result of an audio segment, mainly including the start time and audio moderation result.<br>For the specific output content, see the detailed description of the `AudioSegments` and `AudioResult` data structures.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioSegments(AudioSegments [] AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get If the task status is `Error`, this field will return the error type; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrorType If the task status is `Error`, this field will return the error type; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set If the task status is `Error`, this field will return the error type; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrorType If the task status is `Error`, this field will return the error type; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get If the task status is `Error`, this field will return the error message; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ErrorDescription If the task status is `Error`, this field will return the error message; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorDescription() {
        return this.ErrorDescription;
    }

    /**
     * Set If the task status is `Error`, this field will return the error message; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ErrorDescription If the task status is `Error`, this field will return the error message; otherwise, null will be returned by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    /**
     * Get This field is used to return the creation time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt This field is used to return the creation time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set This field is used to return the creation time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt This field is used to return the creation time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get This field is used to return the last update time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt This field is used to return the last update time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set This field is used to return the last update time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt This field is used to return the last update time of the queried task in ISO 8601 format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

