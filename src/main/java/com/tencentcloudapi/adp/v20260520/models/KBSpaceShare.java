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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBSpaceShare extends AbstractModel {

    /**
    * <p>Whether it has been referenced by other spaces</p>
    */
    @SerializedName("IsSpaceShared")
    @Expose
    private Boolean IsSpaceShared;

    /**
    * <p>Referenced spatial information.</p>
    */
    @SerializedName("SharedSpaceList")
    @Expose
    private Identity [] SharedSpaceList;

    /**
    * <p>Shared state</p>
    */
    @SerializedName("SubStatus")
    @Expose
    private KBShareStatus SubStatus;

    /**
    * <p>Whether operation is allowed</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get <p>Whether it has been referenced by other spaces</p> 
     * @return IsSpaceShared <p>Whether it has been referenced by other spaces</p>
     */
    public Boolean getIsSpaceShared() {
        return this.IsSpaceShared;
    }

    /**
     * Set <p>Whether it has been referenced by other spaces</p>
     * @param IsSpaceShared <p>Whether it has been referenced by other spaces</p>
     */
    public void setIsSpaceShared(Boolean IsSpaceShared) {
        this.IsSpaceShared = IsSpaceShared;
    }

    /**
     * Get <p>Referenced spatial information.</p> 
     * @return SharedSpaceList <p>Referenced spatial information.</p>
     */
    public Identity [] getSharedSpaceList() {
        return this.SharedSpaceList;
    }

    /**
     * Set <p>Referenced spatial information.</p>
     * @param SharedSpaceList <p>Referenced spatial information.</p>
     */
    public void setSharedSpaceList(Identity [] SharedSpaceList) {
        this.SharedSpaceList = SharedSpaceList;
    }

    /**
     * Get <p>Shared state</p> 
     * @return SubStatus <p>Shared state</p>
     */
    public KBShareStatus getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>Shared state</p>
     * @param SubStatus <p>Shared state</p>
     */
    public void setSubStatus(KBShareStatus SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>Whether operation is allowed</p> 
     * @return Enable <p>Whether operation is allowed</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether operation is allowed</p>
     * @param Enable <p>Whether operation is allowed</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public KBSpaceShare() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBSpaceShare(KBSpaceShare source) {
        if (source.IsSpaceShared != null) {
            this.IsSpaceShared = new Boolean(source.IsSpaceShared);
        }
        if (source.SharedSpaceList != null) {
            this.SharedSpaceList = new Identity[source.SharedSpaceList.length];
            for (int i = 0; i < source.SharedSpaceList.length; i++) {
                this.SharedSpaceList[i] = new Identity(source.SharedSpaceList[i]);
            }
        }
        if (source.SubStatus != null) {
            this.SubStatus = new KBShareStatus(source.SubStatus);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSpaceShared", this.IsSpaceShared);
        this.setParamArrayObj(map, prefix + "SharedSpaceList.", this.SharedSpaceList);
        this.setParamObj(map, prefix + "SubStatus.", this.SubStatus);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

