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

public class ExtractCopyRightWatermarkTask extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status, values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed. </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code, 0 means success, other values u200bu200bmean failure:
<li>40000: The input parameters are illegal, please check the input parameters;</li>
<li>60000: Source file error (such as video data damage), Please confirm whether the source file is normal;</li>
<li>70000: Internal service error, it is recommended to try again. </li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Error code. An empty string indicates success. Other values u200bu200bindicate failure. For values, please refer to [Video Processing Error Code](https://www.tencentcloud.com/document/product/266/39145) list.
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * Extract copyright watermark task input information.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private ExtractCopyRightWatermarkTaskInput Input;

    /**
    * Extract copyright watermark task output information.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private ExtractCopyRightWatermarkTaskOutput Output;

    /**
    * Identification code used for deduplication. If there is a request for the same identification code within seven days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to transparently transmit user request information. The task flow status change callback will return the value of this field, which can be up to 1000 characters.
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
     * Get Task status, values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed. </li> 
     * @return Status Task status, values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed. </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed. </li>
     * @param Status Task status, values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed. </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code, 0 means success, other values u200bu200bmean failure:
<li>40000: The input parameters are illegal, please check the input parameters;</li>
<li>60000: Source file error (such as video data damage), Please confirm whether the source file is normal;</li>
<li>70000: Internal service error, it is recommended to try again. </li> 
     * @return ErrCode Error code, 0 means success, other values u200bu200bmean failure:
<li>40000: The input parameters are illegal, please check the input parameters;</li>
<li>60000: Source file error (such as video data damage), Please confirm whether the source file is normal;</li>
<li>70000: Internal service error, it is recommended to try again. </li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code, 0 means success, other values u200bu200bmean failure:
<li>40000: The input parameters are illegal, please check the input parameters;</li>
<li>60000: Source file error (such as video data damage), Please confirm whether the source file is normal;</li>
<li>70000: Internal service error, it is recommended to try again. </li>
     * @param ErrCode Error code, 0 means success, other values u200bu200bmean failure:
<li>40000: The input parameters are illegal, please check the input parameters;</li>
<li>60000: Source file error (such as video data damage), Please confirm whether the source file is normal;</li>
<li>70000: Internal service error, it is recommended to try again. </li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
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
     * Get Error code. An empty string indicates success. Other values u200bu200bindicate failure. For values, please refer to [Video Processing Error Code](https://www.tencentcloud.com/document/product/266/39145) list. 
     * @return ErrCodeExt Error code. An empty string indicates success. Other values u200bu200bindicate failure. For values, please refer to [Video Processing Error Code](https://www.tencentcloud.com/document/product/266/39145) list.
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set Error code. An empty string indicates success. Other values u200bu200bindicate failure. For values, please refer to [Video Processing Error Code](https://www.tencentcloud.com/document/product/266/39145) list.
     * @param ErrCodeExt Error code. An empty string indicates success. Other values u200bu200bindicate failure. For values, please refer to [Video Processing Error Code](https://www.tencentcloud.com/document/product/266/39145) list.
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get Extract copyright watermark task input information.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Input Extract copyright watermark task input information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExtractCopyRightWatermarkTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set Extract copyright watermark task input information.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Input Extract copyright watermark task input information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInput(ExtractCopyRightWatermarkTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get Extract copyright watermark task output information.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Output Extract copyright watermark task output information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExtractCopyRightWatermarkTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Extract copyright watermark task output information.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Output Extract copyright watermark task output information.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutput(ExtractCopyRightWatermarkTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Identification code used for deduplication. If there is a request for the same identification code within seven days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication. 
     * @return SessionId Identification code used for deduplication. If there is a request for the same identification code within seven days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identification code used for deduplication. If there is a request for the same identification code within seven days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     * @param SessionId Identification code used for deduplication. If there is a request for the same identification code within seven days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to transparently transmit user request information. The task flow status change callback will return the value of this field, which can be up to 1000 characters. 
     * @return SessionContext Source context, used to transparently transmit user request information. The task flow status change callback will return the value of this field, which can be up to 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to transparently transmit user request information. The task flow status change callback will return the value of this field, which can be up to 1000 characters.
     * @param SessionContext Source context, used to transparently transmit user request information. The task flow status change callback will return the value of this field, which can be up to 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public ExtractCopyRightWatermarkTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractCopyRightWatermarkTask(ExtractCopyRightWatermarkTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Input != null) {
            this.Input = new ExtractCopyRightWatermarkTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ExtractCopyRightWatermarkTaskOutput(source.Output);
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
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

