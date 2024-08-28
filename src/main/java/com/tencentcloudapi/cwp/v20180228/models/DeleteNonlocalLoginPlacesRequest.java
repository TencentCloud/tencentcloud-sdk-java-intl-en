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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNonlocalLoginPlacesRequest extends AbstractModel {

    /**
    * Method for deleting cross-region log-in events, available values are Ids, Ip, and All. The default is Ids.
    */
    @SerializedName("DelType")
    @Expose
    private String DelType;

    /**
    * Array of cross-region log-in event IDs. Required if DelType is Ids or DelType is not filled.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * IP of cross-region log-in event. Required if DelType is Ip.
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Method for deleting cross-region log-in events, available values are Ids, Ip, and All. The default is Ids. 
     * @return DelType Method for deleting cross-region log-in events, available values are Ids, Ip, and All. The default is Ids.
     */
    public String getDelType() {
        return this.DelType;
    }

    /**
     * Set Method for deleting cross-region log-in events, available values are Ids, Ip, and All. The default is Ids.
     * @param DelType Method for deleting cross-region log-in events, available values are Ids, Ip, and All. The default is Ids.
     */
    public void setDelType(String DelType) {
        this.DelType = DelType;
    }

    /**
     * Get Array of cross-region log-in event IDs. Required if DelType is Ids or DelType is not filled. 
     * @return Ids Array of cross-region log-in event IDs. Required if DelType is Ids or DelType is not filled.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set Array of cross-region log-in event IDs. Required if DelType is Ids or DelType is not filled.
     * @param Ids Array of cross-region log-in event IDs. Required if DelType is Ids or DelType is not filled.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get IP of cross-region log-in event. Required if DelType is Ip. 
     * @return Ip IP of cross-region log-in event. Required if DelType is Ip.
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set IP of cross-region log-in event. Required if DelType is Ip.
     * @param Ip IP of cross-region log-in event. Required if DelType is Ip.
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public DeleteNonlocalLoginPlacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNonlocalLoginPlacesRequest(DeleteNonlocalLoginPlacesRequest source) {
        if (source.DelType != null) {
            this.DelType = new String(source.DelType);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DelType", this.DelType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

