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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReqUserRule extends AbstractModel {

    /**
    * Feature serial number
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Rule switch
0: disabled
1: enabled
2: alarm only
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Reason for modification

0: none (Compatibility records are empty.)
1: avoidance of false positives due to business characteristics
2: reporting of rule-based false positives
3: grayscale release of core business rules
4: others
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get Feature serial number 
     * @return Id Feature serial number
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Feature serial number
     * @param Id Feature serial number
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Rule switch
0: disabled
1: enabled
2: alarm only 
     * @return Status Rule switch
0: disabled
1: enabled
2: alarm only
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule switch
0: disabled
1: enabled
2: alarm only
     * @param Status Rule switch
0: disabled
1: enabled
2: alarm only
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Reason for modification

0: none (Compatibility records are empty.)
1: avoidance of false positives due to business characteristics
2: reporting of rule-based false positives
3: grayscale release of core business rules
4: others 
     * @return Reason Reason for modification

0: none (Compatibility records are empty.)
1: avoidance of false positives due to business characteristics
2: reporting of rule-based false positives
3: grayscale release of core business rules
4: others
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for modification

0: none (Compatibility records are empty.)
1: avoidance of false positives due to business characteristics
2: reporting of rule-based false positives
3: grayscale release of core business rules
4: others
     * @param Reason Reason for modification

0: none (Compatibility records are empty.)
1: avoidance of false positives due to business characteristics
2: reporting of rule-based false positives
3: grayscale release of core business rules
4: others
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public ReqUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReqUserRule(ReqUserRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

