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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkippedCheck extends AbstractModel {

    /**
    * <p>Detection item name</p>
    */
    @SerializedName("Check")
    @Expose
    private String Check;

    /**
    * <p>Skip reason: NotSupported (this card type does not support this detection item) / NotApplicable (prerequisite not met, for example, consistency check requires a back image)</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>Detection item name</p> 
     * @return Check <p>Detection item name</p>
     */
    public String getCheck() {
        return this.Check;
    }

    /**
     * Set <p>Detection item name</p>
     * @param Check <p>Detection item name</p>
     */
    public void setCheck(String Check) {
        this.Check = Check;
    }

    /**
     * Get <p>Skip reason: NotSupported (this card type does not support this detection item) / NotApplicable (prerequisite not met, for example, consistency check requires a back image)</p> 
     * @return Reason <p>Skip reason: NotSupported (this card type does not support this detection item) / NotApplicable (prerequisite not met, for example, consistency check requires a back image)</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>Skip reason: NotSupported (this card type does not support this detection item) / NotApplicable (prerequisite not met, for example, consistency check requires a back image)</p>
     * @param Reason <p>Skip reason: NotSupported (this card type does not support this detection item) / NotApplicable (prerequisite not met, for example, consistency check requires a back image)</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public SkippedCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkippedCheck(SkippedCheck source) {
        if (source.Check != null) {
            this.Check = new String(source.Check);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Check", this.Check);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

