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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserApplicationStore extends AbstractModel {

    /**
    * <p>Cos bucket name</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>Cos Bucket Region</p>
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * <p>Repository type. LOG: application logs; ARCHIVE: application archive.</p>
    */
    @SerializedName("StoreType")
    @Expose
    private String StoreType;

    /**
    * <p>Repository status. ON: enabled; OFF: disabled.</p>
    */
    @SerializedName("StoreState")
    @Expose
    private String StoreState;

    /**
    * <p>Repository path</p><p>Primary path data. If StoreType is ARCHIVE and SubStorePaths is configured, the system default value will be used.</p>
    */
    @SerializedName("StorePath")
    @Expose
    private String StorePath;

    /**
    * <p>Subpath list</p><p>Subpath data (multi-path pattern) supports only ARCHIVE StoreType; up to 25 data entries.</p>
    */
    @SerializedName("SubStorePaths")
    @Expose
    private String [] SubStorePaths;

    /**
     * Get <p>Cos bucket name</p> 
     * @return CosBucket <p>Cos bucket name</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>Cos bucket name</p>
     * @param CosBucket <p>Cos bucket name</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>Cos Bucket Region</p> 
     * @return CosRegion <p>Cos Bucket Region</p>
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set <p>Cos Bucket Region</p>
     * @param CosRegion <p>Cos Bucket Region</p>
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get <p>Repository type. LOG: application logs; ARCHIVE: application archive.</p> 
     * @return StoreType <p>Repository type. LOG: application logs; ARCHIVE: application archive.</p>
     */
    public String getStoreType() {
        return this.StoreType;
    }

    /**
     * Set <p>Repository type. LOG: application logs; ARCHIVE: application archive.</p>
     * @param StoreType <p>Repository type. LOG: application logs; ARCHIVE: application archive.</p>
     */
    public void setStoreType(String StoreType) {
        this.StoreType = StoreType;
    }

    /**
     * Get <p>Repository status. ON: enabled; OFF: disabled.</p> 
     * @return StoreState <p>Repository status. ON: enabled; OFF: disabled.</p>
     */
    public String getStoreState() {
        return this.StoreState;
    }

    /**
     * Set <p>Repository status. ON: enabled; OFF: disabled.</p>
     * @param StoreState <p>Repository status. ON: enabled; OFF: disabled.</p>
     */
    public void setStoreState(String StoreState) {
        this.StoreState = StoreState;
    }

    /**
     * Get <p>Repository path</p><p>Primary path data. If StoreType is ARCHIVE and SubStorePaths is configured, the system default value will be used.</p> 
     * @return StorePath <p>Repository path</p><p>Primary path data. If StoreType is ARCHIVE and SubStorePaths is configured, the system default value will be used.</p>
     */
    public String getStorePath() {
        return this.StorePath;
    }

    /**
     * Set <p>Repository path</p><p>Primary path data. If StoreType is ARCHIVE and SubStorePaths is configured, the system default value will be used.</p>
     * @param StorePath <p>Repository path</p><p>Primary path data. If StoreType is ARCHIVE and SubStorePaths is configured, the system default value will be used.</p>
     */
    public void setStorePath(String StorePath) {
        this.StorePath = StorePath;
    }

    /**
     * Get <p>Subpath list</p><p>Subpath data (multi-path pattern) supports only ARCHIVE StoreType; up to 25 data entries.</p> 
     * @return SubStorePaths <p>Subpath list</p><p>Subpath data (multi-path pattern) supports only ARCHIVE StoreType; up to 25 data entries.</p>
     */
    public String [] getSubStorePaths() {
        return this.SubStorePaths;
    }

    /**
     * Set <p>Subpath list</p><p>Subpath data (multi-path pattern) supports only ARCHIVE StoreType; up to 25 data entries.</p>
     * @param SubStorePaths <p>Subpath list</p><p>Subpath data (multi-path pattern) supports only ARCHIVE StoreType; up to 25 data entries.</p>
     */
    public void setSubStorePaths(String [] SubStorePaths) {
        this.SubStorePaths = SubStorePaths;
    }

    public UserApplicationStore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserApplicationStore(UserApplicationStore source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.StoreType != null) {
            this.StoreType = new String(source.StoreType);
        }
        if (source.StoreState != null) {
            this.StoreState = new String(source.StoreState);
        }
        if (source.StorePath != null) {
            this.StorePath = new String(source.StorePath);
        }
        if (source.SubStorePaths != null) {
            this.SubStorePaths = new String[source.SubStorePaths.length];
            for (int i = 0; i < source.SubStorePaths.length; i++) {
                this.SubStorePaths[i] = new String(source.SubStorePaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "StoreType", this.StoreType);
        this.setParamSimple(map, prefix + "StoreState", this.StoreState);
        this.setParamSimple(map, prefix + "StorePath", this.StorePath);
        this.setParamArraySimple(map, prefix + "SubStorePaths.", this.SubStorePaths);

    }
}

