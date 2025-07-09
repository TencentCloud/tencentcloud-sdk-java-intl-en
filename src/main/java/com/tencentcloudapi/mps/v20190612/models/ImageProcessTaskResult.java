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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProcessTaskResult extends AbstractModel {

    /**
    * Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error message.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Transcoding task output.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private ImageProcessTaskOutput Output;

    /**
    * Transcoding progress, with a value range of [0-100].
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Status Task status, including PROCESSING, SUCCESS, and FAIL.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error message.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Message Error message.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Message Error message.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Transcoding task output.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Output Transcoding task output.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ImageProcessTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Transcoding task output.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Output Transcoding task output.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutput(ImageProcessTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get Transcoding progress, with a value range of [0-100].
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Progress Transcoding progress, with a value range of [0-100].
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Transcoding progress, with a value range of [0-100].
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Progress Transcoding progress, with a value range of [0-100].
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public ImageProcessTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessTaskResult(ImageProcessTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Output != null) {
            this.Output = new ImageProcessTaskOutput(source.Output);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

