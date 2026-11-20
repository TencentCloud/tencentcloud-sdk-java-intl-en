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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceViolationDetail extends AbstractModel {

    /**
    *  Source: RESTRICT: Banned; FREEZW: Frozen.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Whether self-service unblocking is allowed. 1: Yes; 2: No.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Violation type.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Violation content (URL and associated domain name).
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get  Source: RESTRICT: Banned; FREEZW: Frozen. 
     * @return Source  Source: RESTRICT: Banned; FREEZW: Frozen.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set  Source: RESTRICT: Banned; FREEZW: Frozen.
     * @param Source  Source: RESTRICT: Banned; FREEZW: Frozen.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Whether self-service unblocking is allowed. 1: Yes; 2: No. 
     * @return State Whether self-service unblocking is allowed. 1: Yes; 2: No.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Whether self-service unblocking is allowed. 1: Yes; 2: No.
     * @param State Whether self-service unblocking is allowed. 1: Yes; 2: No.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Violation type. 
     * @return Reason Violation type.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Violation type.
     * @param Reason Violation type.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Violation content (URL and associated domain name). 
     * @return Content Violation content (URL and associated domain name).
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Violation content (URL and associated domain name).
     * @param Content Violation content (URL and associated domain name).
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public InstanceViolationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceViolationDetail(InstanceViolationDetail source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

