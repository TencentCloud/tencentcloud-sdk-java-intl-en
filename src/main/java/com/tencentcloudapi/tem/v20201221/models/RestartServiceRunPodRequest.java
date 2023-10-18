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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartServiceRunPodRequest extends AbstractModel {

    /**
    * Environment ID.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Pod name.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Number of items per page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pod status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Source channel.
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get Environment ID. 
     * @return NamespaceId Environment ID.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Environment ID.
     * @param NamespaceId Environment ID.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Service ID. 
     * @return ServiceId Service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID.
     * @param ServiceId Service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Pod name. 
     * @return PodName Pod name.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name.
     * @param PodName Pod name.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Number of items per page. 
     * @return Limit Number of items per page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page.
     * @param Limit Number of items per page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. 
     * @return Offset Page number.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number.
     * @param Offset Page number.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pod status. 
     * @return Status Pod status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Pod status.
     * @param Status Pod status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Source channel. 
     * @return SourceChannel Source channel.
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel.
     * @param SourceChannel Source channel.
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    public RestartServiceRunPodRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartServiceRunPodRequest(RestartServiceRunPodRequest source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

