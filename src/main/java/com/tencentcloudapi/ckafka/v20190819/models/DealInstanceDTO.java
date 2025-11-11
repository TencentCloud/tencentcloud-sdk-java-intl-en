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
    * Order transaction.
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * Order transaction corresponds to the list of purchased CKafka instance ids.
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
     * Get Order transaction. 
     * @return DealName Order transaction.
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set Order transaction.
     * @param DealName Order transaction.
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get Order transaction corresponds to the list of purchased CKafka instance ids. 
     * @return InstanceIdList Order transaction corresponds to the list of purchased CKafka instance ids.
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set Order transaction corresponds to the list of purchased CKafka instance ids.
     * @param InstanceIdList Order transaction corresponds to the list of purchased CKafka instance ids.
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

