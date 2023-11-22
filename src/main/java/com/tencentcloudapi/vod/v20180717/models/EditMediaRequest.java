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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaRequest extends AbstractModel {

    /**
    * Input the type of video. The possible values u200bu200bare File and Stream.
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Input video file information, required when InputType is File.
    */
    @SerializedName("FileInfos")
    @Expose
    private EditMediaFileInfo [] FileInfos;

    /**
    * nput stream information, required when InputType is Stream.
    */
    @SerializedName("StreamInfos")
    @Expose
    private EditMediaStreamInfo [] StreamInfos;

    /**
    * EditMedia template ID. The values u200bu200bare 10 and 20. If left blank, the 10 template is used. 
<li>10: When splicing, the input with the highest resolution is used as the benchmark;</li>
<li>20: When splicing, the input with the highest code rate is used as the benchmark. </li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Task flow template name, if you want Fill in when executing the task flow on the generated new video.
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * The file configuration generated after editing.
    */
    @SerializedName("OutputConfig")
    @Expose
    private EditMediaOutputConfig OutputConfig;

    /**
    * Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reserved fields, used for special purposes.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get Input the type of video. The possible values u200bu200bare File and Stream. 
     * @return InputType Input the type of video. The possible values u200bu200bare File and Stream.
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Input the type of video. The possible values u200bu200bare File and Stream.
     * @param InputType Input the type of video. The possible values u200bu200bare File and Stream.
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b> 
     * @return SubAppId </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     * @param SubAppId </b>VOD Application ID. If you want to access resources in a sub-app, fill in this field with the sub-app ID; otherwise, don't fill in this field.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Input video file information, required when InputType is File. 
     * @return FileInfos Input video file information, required when InputType is File.
     */
    public EditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input video file information, required when InputType is File.
     * @param FileInfos Input video file information, required when InputType is File.
     */
    public void setFileInfos(EditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get nput stream information, required when InputType is Stream. 
     * @return StreamInfos nput stream information, required when InputType is Stream.
     */
    public EditMediaStreamInfo [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set nput stream information, required when InputType is Stream.
     * @param StreamInfos nput stream information, required when InputType is Stream.
     */
    public void setStreamInfos(EditMediaStreamInfo [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get EditMedia template ID. The values u200bu200bare 10 and 20. If left blank, the 10 template is used. 
<li>10: When splicing, the input with the highest resolution is used as the benchmark;</li>
<li>20: When splicing, the input with the highest code rate is used as the benchmark. </li> 
     * @return Definition EditMedia template ID. The values u200bu200bare 10 and 20. If left blank, the 10 template is used. 
<li>10: When splicing, the input with the highest resolution is used as the benchmark;</li>
<li>20: When splicing, the input with the highest code rate is used as the benchmark. </li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set EditMedia template ID. The values u200bu200bare 10 and 20. If left blank, the 10 template is used. 
<li>10: When splicing, the input with the highest resolution is used as the benchmark;</li>
<li>20: When splicing, the input with the highest code rate is used as the benchmark. </li>
     * @param Definition EditMedia template ID. The values u200bu200bare 10 and 20. If left blank, the 10 template is used. 
<li>10: When splicing, the input with the highest resolution is used as the benchmark;</li>
<li>20: When splicing, the input with the highest code rate is used as the benchmark. </li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Task flow template name, if you want Fill in when executing the task flow on the generated new video. 
     * @return ProcedureName Task flow template name, if you want Fill in when executing the task flow on the generated new video.
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set Task flow template name, if you want Fill in when executing the task flow on the generated new video.
     * @param ProcedureName Task flow template name, if you want Fill in when executing the task flow on the generated new video.
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get The file configuration generated after editing. 
     * @return OutputConfig The file configuration generated after editing.
     */
    public EditMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set The file configuration generated after editing.
     * @param OutputConfig The file configuration generated after editing.
     */
    public void setOutputConfig(EditMediaOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters. 
     * @return SessionContext Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
     * @param SessionContext Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0. 
     * @return TasksPriority The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
     * @param TasksPriority The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication. 
     * @return SessionId The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     * @param SessionId The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reserved fields, used for special purposes. 
     * @return ExtInfo Reserved fields, used for special purposes.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved fields, used for special purposes.
     * @param ExtInfo Reserved fields, used for special purposes.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public EditMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaRequest(EditMediaRequest source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new EditMediaFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new EditMediaFileInfo(source.FileInfos[i]);
            }
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new EditMediaStreamInfo[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new EditMediaStreamInfo(source.StreamInfos[i]);
            }
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ProcedureName != null) {
            this.ProcedureName = new String(source.ProcedureName);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new EditMediaOutputConfig(source.OutputConfig);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ProcedureName", this.ProcedureName);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

