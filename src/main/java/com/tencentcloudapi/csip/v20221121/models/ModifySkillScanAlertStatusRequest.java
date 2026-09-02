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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySkillScanAlertStatusRequest extends AbstractModel {

    /**
    * List of alarm record IDs
Input parameter limit: 100 at a time
Value reference: obtained through the DescribeSkillScanAlertList API.
    */
    @SerializedName("IDs")
    @Expose
    private Long [] IDs;

    /**
    * Target processing status
Enumeration value:
1: Processed
2: Ignored
3: Trusted
- 4: Deleted (soft deletion).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Group account member id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get List of alarm record IDs
Input parameter limit: 100 at a time
Value reference: obtained through the DescribeSkillScanAlertList API. 
     * @return IDs List of alarm record IDs
Input parameter limit: 100 at a time
Value reference: obtained through the DescribeSkillScanAlertList API.
     */
    public Long [] getIDs() {
        return this.IDs;
    }

    /**
     * Set List of alarm record IDs
Input parameter limit: 100 at a time
Value reference: obtained through the DescribeSkillScanAlertList API.
     * @param IDs List of alarm record IDs
Input parameter limit: 100 at a time
Value reference: obtained through the DescribeSkillScanAlertList API.
     */
    public void setIDs(Long [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get Target processing status
Enumeration value:
1: Processed
2: Ignored
3: Trusted
- 4: Deleted (soft deletion). 
     * @return Status Target processing status
Enumeration value:
1: Processed
2: Ignored
3: Trusted
- 4: Deleted (soft deletion).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Target processing status
Enumeration value:
1: Processed
2: Ignored
3: Trusted
- 4: Deleted (soft deletion).
     * @param Status Target processing status
Enumeration value:
1: Processed
2: Ignored
3: Trusted
- 4: Deleted (soft deletion).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Group account member id 
     * @return MemberId Group account member id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group account member id
     * @param MemberId Group account member id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifySkillScanAlertStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySkillScanAlertStatusRequest(ModifySkillScanAlertStatusRequest source) {
        if (source.IDs != null) {
            this.IDs = new Long[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new Long(source.IDs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

