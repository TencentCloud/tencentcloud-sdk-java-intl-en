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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeCheckJobResponse extends AbstractModel {

    /**
    * Subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Failure or error prompts, success signals 'success'.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Job running status. Valid values: running, failed, success.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Current overall progress. Value range: 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Total check steps
    */
    @SerializedName("StepAll")
    @Expose
    private Long StepAll;

    /**
    * Current step in execution
    */
    @SerializedName("StepNow")
    @Expose
    private Long StepNow;

    /**
    * Running status of each stepNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Steps")
    @Expose
    private SubscribeCheckStepInfo [] Steps;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Subscription instance ID 
     * @return SubscribeId Subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Subscription instance ID
     * @param SubscribeId Subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Failure or error prompts, success signals 'success'.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Failure or error prompts, success signals 'success'.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Failure or error prompts, success signals 'success'.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Failure or error prompts, success signals 'success'.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Job running status. Valid values: running, failed, success. 
     * @return Status Job running status. Valid values: running, failed, success.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Job running status. Valid values: running, failed, success.
     * @param Status Job running status. Valid values: running, failed, success.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Current overall progress. Value range: 0-100. 
     * @return Progress Current overall progress. Value range: 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Current overall progress. Value range: 0-100.
     * @param Progress Current overall progress. Value range: 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Total check steps 
     * @return StepAll Total check steps
     */
    public Long getStepAll() {
        return this.StepAll;
    }

    /**
     * Set Total check steps
     * @param StepAll Total check steps
     */
    public void setStepAll(Long StepAll) {
        this.StepAll = StepAll;
    }

    /**
     * Get Current step in execution 
     * @return StepNow Current step in execution
     */
    public Long getStepNow() {
        return this.StepNow;
    }

    /**
     * Set Current step in execution
     * @param StepNow Current step in execution
     */
    public void setStepNow(Long StepNow) {
        this.StepNow = StepNow;
    }

    /**
     * Get Running status of each stepNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Steps Running status of each stepNote: This field may return null, indicating that no valid values can be obtained.
     */
    public SubscribeCheckStepInfo [] getSteps() {
        return this.Steps;
    }

    /**
     * Set Running status of each stepNote: This field may return null, indicating that no valid values can be obtained.
     * @param Steps Running status of each stepNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSteps(SubscribeCheckStepInfo [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSubscribeCheckJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeCheckJobResponse(DescribeSubscribeCheckJobResponse source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StepAll != null) {
            this.StepAll = new Long(source.StepAll);
        }
        if (source.StepNow != null) {
            this.StepNow = new Long(source.StepNow);
        }
        if (source.Steps != null) {
            this.Steps = new SubscribeCheckStepInfo[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new SubscribeCheckStepInfo(source.Steps[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StepAll", this.StepAll);
        this.setParamSimple(map, prefix + "StepNow", this.StepNow);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

