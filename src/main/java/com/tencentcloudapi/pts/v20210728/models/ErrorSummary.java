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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorSummary extends AbstractModel {

    /**
    * Status code.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Result code.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Number of error occurrences.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Error rate.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Rate")
    @Expose
    private Float Rate;

    /**
    * Error message.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Request protocol type.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
     * Get Status code.

Note: This field may return null, indicating that no valid value is found. 
     * @return Status Status code.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status code.

Note: This field may return null, indicating that no valid value is found.
     * @param Status Status code.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Result code.

Note: This field may return null, indicating that no valid value is found. 
     * @return Result Result code.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Result code.

Note: This field may return null, indicating that no valid value is found.
     * @param Result Result code.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Number of error occurrences.

Note: This field may return null, indicating that no valid value is found. 
     * @return Count Number of error occurrences.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of error occurrences.

Note: This field may return null, indicating that no valid value is found.
     * @param Count Number of error occurrences.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Error rate.

Note: This field may return null, indicating that no valid value is found. 
     * @return Rate Error rate.

Note: This field may return null, indicating that no valid value is found.
     */
    public Float getRate() {
        return this.Rate;
    }

    /**
     * Set Error rate.

Note: This field may return null, indicating that no valid value is found.
     * @param Rate Error rate.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRate(Float Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Error message.

Note: This field may return null, indicating that no valid value is found. 
     * @return Message Error message.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.

Note: This field may return null, indicating that no valid value is found.
     * @param Message Error message.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Request protocol type.

Note: This field may return null, indicating that no valid value is found. 
     * @return Proto Request protocol type.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Request protocol type.

Note: This field may return null, indicating that no valid value is found.
     * @param Proto Request protocol type.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public ErrorSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorSummary(ErrorSummary source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Rate != null) {
            this.Rate = new Float(source.Rate);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Proto", this.Proto);

    }
}

