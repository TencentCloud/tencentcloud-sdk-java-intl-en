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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagComplianceDetails extends AbstractModel {

    /**
    * Compliance status. true: compliant; false: non-compliant.
    */
    @SerializedName("ComplianceStatus")
    @Expose
    private Boolean ComplianceStatus;

    /**
    * List of tag keys with invalid values.
    */
    @SerializedName("KeysWithNonCompliantValues")
    @Expose
    private String [] KeysWithNonCompliantValues;

    /**
    * List of invalid tag keys.
    */
    @SerializedName("NonCompliantKeys")
    @Expose
    private String [] NonCompliantKeys;

    /**
     * Get Compliance status. true: compliant; false: non-compliant. 
     * @return ComplianceStatus Compliance status. true: compliant; false: non-compliant.
     */
    public Boolean getComplianceStatus() {
        return this.ComplianceStatus;
    }

    /**
     * Set Compliance status. true: compliant; false: non-compliant.
     * @param ComplianceStatus Compliance status. true: compliant; false: non-compliant.
     */
    public void setComplianceStatus(Boolean ComplianceStatus) {
        this.ComplianceStatus = ComplianceStatus;
    }

    /**
     * Get List of tag keys with invalid values. 
     * @return KeysWithNonCompliantValues List of tag keys with invalid values.
     */
    public String [] getKeysWithNonCompliantValues() {
        return this.KeysWithNonCompliantValues;
    }

    /**
     * Set List of tag keys with invalid values.
     * @param KeysWithNonCompliantValues List of tag keys with invalid values.
     */
    public void setKeysWithNonCompliantValues(String [] KeysWithNonCompliantValues) {
        this.KeysWithNonCompliantValues = KeysWithNonCompliantValues;
    }

    /**
     * Get List of invalid tag keys. 
     * @return NonCompliantKeys List of invalid tag keys.
     */
    public String [] getNonCompliantKeys() {
        return this.NonCompliantKeys;
    }

    /**
     * Set List of invalid tag keys.
     * @param NonCompliantKeys List of invalid tag keys.
     */
    public void setNonCompliantKeys(String [] NonCompliantKeys) {
        this.NonCompliantKeys = NonCompliantKeys;
    }

    public TagComplianceDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagComplianceDetails(TagComplianceDetails source) {
        if (source.ComplianceStatus != null) {
            this.ComplianceStatus = new Boolean(source.ComplianceStatus);
        }
        if (source.KeysWithNonCompliantValues != null) {
            this.KeysWithNonCompliantValues = new String[source.KeysWithNonCompliantValues.length];
            for (int i = 0; i < source.KeysWithNonCompliantValues.length; i++) {
                this.KeysWithNonCompliantValues[i] = new String(source.KeysWithNonCompliantValues[i]);
            }
        }
        if (source.NonCompliantKeys != null) {
            this.NonCompliantKeys = new String[source.NonCompliantKeys.length];
            for (int i = 0; i < source.NonCompliantKeys.length; i++) {
                this.NonCompliantKeys[i] = new String(source.NonCompliantKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceStatus", this.ComplianceStatus);
        this.setParamArraySimple(map, prefix + "KeysWithNonCompliantValues.", this.KeysWithNonCompliantValues);
        this.setParamArraySimple(map, prefix + "NonCompliantKeys.", this.NonCompliantKeys);

    }
}

