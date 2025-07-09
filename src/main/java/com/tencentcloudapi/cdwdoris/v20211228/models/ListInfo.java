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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListInfo extends AbstractModel {

    /**
    * Partition name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * Enumeration values of each partition column

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnumValues")
    @Expose
    private String [] EnumValues;

    /**
     * Get Partition name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionName Partition name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set Partition name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionName Partition name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get Enumeration values of each partition column

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnumValues Enumeration values of each partition column

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getEnumValues() {
        return this.EnumValues;
    }

    /**
     * Set Enumeration values of each partition column

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnumValues Enumeration values of each partition column

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnumValues(String [] EnumValues) {
        this.EnumValues = EnumValues;
    }

    public ListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListInfo(ListInfo source) {
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.EnumValues != null) {
            this.EnumValues = new String[source.EnumValues.length];
            for (int i = 0; i < source.EnumValues.length; i++) {
                this.EnumValues[i] = new String(source.EnumValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamArraySimple(map, prefix + "EnumValues.", this.EnumValues);

    }
}

