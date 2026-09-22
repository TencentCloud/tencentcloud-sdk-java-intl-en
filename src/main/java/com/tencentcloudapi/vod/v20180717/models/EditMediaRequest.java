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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaRequest extends AbstractModel {

    /**
    * Type of input video. Valid values: `File` and `Stream`.
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Input video file information. Required when InputType is File.
    */
    @SerializedName("FileInfos")
    @Expose
    private EditMediaFileInfo [] FileInfos;

    /**
    * Input stream information. Required when `InputType` is `Stream`.
    */
    @SerializedName("StreamInfos")
    @Expose
    private EditMediaStreamInfo [] StreamInfos;

    /**
    * Edit template ID. Valid values: 10 and 20. Default value: 10.
<li>10: During splicing, use the input with the highest resolution as the base;</li>
<li>20: During splicing, use the input with the highest bitrate as the base.</li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in if you want to execute a task flow on the generated new video.
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * File configuration generated after editing.
    */
    @SerializedName("OutputConfig")
    @Expose
    private EditMediaOutputConfig OutputConfig;

    /**
    * Identify source context, used to pass through user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback. Maximum length: 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reserved field, used for special purposes.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get Type of input video. Valid values: `File` and `Stream`. 
     * @return InputType Type of input video. Valid values: `File` and `Stream`.
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set Type of input video. Valid values: `File` and `Stream`.
     * @param InputType Type of input video. Valid values: `File` and `Stream`.
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Input video file information. Required when InputType is File. 
     * @return FileInfos Input video file information. Required when InputType is File.
     */
    public EditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input video file information. Required when InputType is File.
     * @param FileInfos Input video file information. Required when InputType is File.
     */
    public void setFileInfos(EditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Input stream information. Required when `InputType` is `Stream`. 
     * @return StreamInfos Input stream information. Required when `InputType` is `Stream`.
     */
    public EditMediaStreamInfo [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Input stream information. Required when `InputType` is `Stream`.
     * @param StreamInfos Input stream information. Required when `InputType` is `Stream`.
     */
    public void setStreamInfos(EditMediaStreamInfo [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get Edit template ID. Valid values: 10 and 20. Default value: 10.
<li>10: During splicing, use the input with the highest resolution as the base;</li>
<li>20: During splicing, use the input with the highest bitrate as the base.</li> 
     * @return Definition Edit template ID. Valid values: 10 and 20. Default value: 10.
<li>10: During splicing, use the input with the highest resolution as the base;</li>
<li>20: During splicing, use the input with the highest bitrate as the base.</li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Edit template ID. Valid values: 10 and 20. Default value: 10.
<li>10: During splicing, use the input with the highest resolution as the base;</li>
<li>20: During splicing, use the input with the highest bitrate as the base.</li>
     * @param Definition Edit template ID. Valid values: 10 and 20. Default value: 10.
<li>10: During splicing, use the input with the highest resolution as the base;</li>
<li>20: During splicing, use the input with the highest bitrate as the base.</li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in if you want to execute a task flow on the generated new video. 
     * @return ProcedureName [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in if you want to execute a task flow on the generated new video.
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * Set [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in if you want to execute a task flow on the generated new video.
     * @param ProcedureName [Task flow](https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E6.B5.81) name. Fill in if you want to execute a task flow on the generated new video.
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * Get File configuration generated after editing. 
     * @return OutputConfig File configuration generated after editing.
     */
    public EditMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set File configuration generated after editing.
     * @param OutputConfig File configuration generated after editing.
     */
    public void setOutputConfig(EditMediaOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get Identify source context, used to pass through user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback. Maximum length: 1000 characters. 
     * @return SessionContext Identify source context, used to pass through user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback. Maximum length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Identify source context, used to pass through user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback. Maximum length: 1000 characters.
     * @param SessionContext Identify source context, used to pass through user request information. This field value will be returned in the EditMediaComplete callback and task flow status change callback. Maximum length: 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0. 
     * @return TasksPriority Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     * @param TasksPriority Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication. 
     * @return SessionId Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
     * @param SessionId Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using an empty string indicates no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reserved field, used for special purposes. 
     * @return ExtInfo Reserved field, used for special purposes.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used for special purposes.
     * @param ExtInfo Reserved field, used for special purposes.
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

