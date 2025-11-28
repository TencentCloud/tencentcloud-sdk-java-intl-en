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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNameIndexSettings extends AbstractModel {

    /**
    * Whether to enable instance name index. Default value: false. Value range:.

**true**: indicates that instance name index is enabled.
**false**: indicates that instance name index is disabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Begin index number. Value range: [0, 99999999].

Indicates that the scale out activity will be failed when the index out of range. 
If not specified, carries forward historical index number or 0.
Lowering the index sequence number may lead to instance name duplication within the group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginIndex")
    @Expose
    private Long BeginIndex;

    /**
    * Instance name index number digits, defaults to 0, means no specified digit count. Value range: 0-8, maximum is integer 8. when using values 1-8, the system checks whether the index number exceeds the maximum digit for this digit count.

If set to 3, index number is in the format: 000, 001, 002 ... 010, 011 ... 100 ... 999. The maximum is 999. 
Assuming set to 0, the index number is 0, 1, 2 ... 10, 11 ... 100 ... 1000 ...10000 ... 99999999. Max number is 99999999.
    */
    @SerializedName("IndexLength")
    @Expose
    private Long IndexLength;

    /**
     * Get Whether to enable instance name index. Default value: false. Value range:.

**true**: indicates that instance name index is enabled.
**false**: indicates that instance name index is disabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enabled Whether to enable instance name index. Default value: false. Value range:.

**true**: indicates that instance name index is enabled.
**false**: indicates that instance name index is disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable instance name index. Default value: false. Value range:.

**true**: indicates that instance name index is enabled.
**false**: indicates that instance name index is disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enabled Whether to enable instance name index. Default value: false. Value range:.

**true**: indicates that instance name index is enabled.
**false**: indicates that instance name index is disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Begin index number. Value range: [0, 99999999].

Indicates that the scale out activity will be failed when the index out of range. 
If not specified, carries forward historical index number or 0.
Lowering the index sequence number may lead to instance name duplication within the group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginIndex Begin index number. Value range: [0, 99999999].

Indicates that the scale out activity will be failed when the index out of range. 
If not specified, carries forward historical index number or 0.
Lowering the index sequence number may lead to instance name duplication within the group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBeginIndex() {
        return this.BeginIndex;
    }

    /**
     * Set Begin index number. Value range: [0, 99999999].

Indicates that the scale out activity will be failed when the index out of range. 
If not specified, carries forward historical index number or 0.
Lowering the index sequence number may lead to instance name duplication within the group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginIndex Begin index number. Value range: [0, 99999999].

Indicates that the scale out activity will be failed when the index out of range. 
If not specified, carries forward historical index number or 0.
Lowering the index sequence number may lead to instance name duplication within the group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginIndex(Long BeginIndex) {
        this.BeginIndex = BeginIndex;
    }

    /**
     * Get Instance name index number digits, defaults to 0, means no specified digit count. Value range: 0-8, maximum is integer 8. when using values 1-8, the system checks whether the index number exceeds the maximum digit for this digit count.

If set to 3, index number is in the format: 000, 001, 002 ... 010, 011 ... 100 ... 999. The maximum is 999. 
Assuming set to 0, the index number is 0, 1, 2 ... 10, 11 ... 100 ... 1000 ...10000 ... 99999999. Max number is 99999999. 
     * @return IndexLength Instance name index number digits, defaults to 0, means no specified digit count. Value range: 0-8, maximum is integer 8. when using values 1-8, the system checks whether the index number exceeds the maximum digit for this digit count.

If set to 3, index number is in the format: 000, 001, 002 ... 010, 011 ... 100 ... 999. The maximum is 999. 
Assuming set to 0, the index number is 0, 1, 2 ... 10, 11 ... 100 ... 1000 ...10000 ... 99999999. Max number is 99999999.
     */
    public Long getIndexLength() {
        return this.IndexLength;
    }

    /**
     * Set Instance name index number digits, defaults to 0, means no specified digit count. Value range: 0-8, maximum is integer 8. when using values 1-8, the system checks whether the index number exceeds the maximum digit for this digit count.

If set to 3, index number is in the format: 000, 001, 002 ... 010, 011 ... 100 ... 999. The maximum is 999. 
Assuming set to 0, the index number is 0, 1, 2 ... 10, 11 ... 100 ... 1000 ...10000 ... 99999999. Max number is 99999999.
     * @param IndexLength Instance name index number digits, defaults to 0, means no specified digit count. Value range: 0-8, maximum is integer 8. when using values 1-8, the system checks whether the index number exceeds the maximum digit for this digit count.

If set to 3, index number is in the format: 000, 001, 002 ... 010, 011 ... 100 ... 999. The maximum is 999. 
Assuming set to 0, the index number is 0, 1, 2 ... 10, 11 ... 100 ... 1000 ...10000 ... 99999999. Max number is 99999999.
     */
    public void setIndexLength(Long IndexLength) {
        this.IndexLength = IndexLength;
    }

    public InstanceNameIndexSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNameIndexSettings(InstanceNameIndexSettings source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.BeginIndex != null) {
            this.BeginIndex = new Long(source.BeginIndex);
        }
        if (source.IndexLength != null) {
            this.IndexLength = new Long(source.IndexLength);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "BeginIndex", this.BeginIndex);
        this.setParamSimple(map, prefix + "IndexLength", this.IndexLength);

    }
}

