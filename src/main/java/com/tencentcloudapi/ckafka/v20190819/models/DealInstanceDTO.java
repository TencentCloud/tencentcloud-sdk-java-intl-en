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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealInstanceDTO extends AbstractModel {

    /**
    * Order list.  Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * ID list of the purchased CKafka instances corresponding to the order list.  Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
     * Get Order list.  Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealName Order list.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order list.  Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealName Order list.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get ID list of the purchased CKafka instances corresponding to the order list.  Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceIdList ID list of the purchased CKafka instances corresponding to the order list.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set ID list of the purchased CKafka instances corresponding to the order list.  Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceIdList ID list of the purchased CKafka instances corresponding to the order list.  Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    public DealInstanceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealInstanceDTO(DealInstanceDTO source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);

    }
}

