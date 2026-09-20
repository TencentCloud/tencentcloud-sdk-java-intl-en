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

public class DescribeFileAttributesTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data corruption). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Task progress. Value range: [0-100].
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Output of a media file attribute retrieval task.
    */
    @SerializedName("Output")
    @Expose
    private DescribeFileAttributesTaskOutput Output;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status. Valid values are PROCESSING, SUCCESS, and FAIL. 
     * @return Status Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     * @param Status Task status. Valid values are PROCESSING, SUCCESS, and FAIL.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data corruption). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li> 
     * @return ErrCode Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data corruption). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data corruption). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
     * @param ErrCode Error code. 0 indicates success. Other values indicate failure:
<li>40000: invalid parameters. Check the input parameters;</li>
<li>60000: Source file error (for example, video data corruption). Confirm whether the source file is normal;</li>
<li>70000: internal service error. Retry is recommended.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81). 
     * @return ErrCodeExt Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     * @param ErrCodeExt Error code. An empty string indicates success, and other values indicate failure. For values, see [Video Processing Error Codes](https://www.tencentcloud.com/document/product/266/50368?from_cn_redirect=1#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81).
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Task progress. Value range: [0-100]. 
     * @return Progress Task progress. Value range: [0-100].
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress. Value range: [0-100].
     * @param Progress Task progress. Value range: [0-100].
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Media file ID. 
     * @return FileId Media file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
     * @param FileId Media file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Output of a media file attribute retrieval task. 
     * @return Output Output of a media file attribute retrieval task.
     */
    public DescribeFileAttributesTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output of a media file attribute retrieval task.
     * @param Output Output of a media file attribute retrieval task.
     */
    public void setOutput(DescribeFileAttributesTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters. 
     * @return SessionContext Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     * @param SessionContext Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public DescribeFileAttributesTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileAttributesTask(DescribeFileAttributesTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Output != null) {
            this.Output = new DescribeFileAttributesTaskOutput(source.Output);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

