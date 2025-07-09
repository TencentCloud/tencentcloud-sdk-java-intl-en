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
    * COS bucket name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Repository type. LOG: application logs; ARCHIVE: application archive.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StoreType")
    @Expose
    private String StoreType;

    /**
    * Repository status. ON: enabled; OFF: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StoreState")
    @Expose
    private String StoreState;

    /**
    * Repository path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorePath")
    @Expose
    private String StorePath;

    /**
     * Get COS bucket name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosBucket COS bucket name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS bucket name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosBucket COS bucket name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosRegion COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosRegion COS bucket region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Repository type. LOG: application logs; ARCHIVE: application archive.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StoreType Repository type. LOG: application logs; ARCHIVE: application archive.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStoreType() {
        return this.StoreType;
    }

    /**
     * Set Repository type. LOG: application logs; ARCHIVE: application archive.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StoreType Repository type. LOG: application logs; ARCHIVE: application archive.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStoreType(String StoreType) {
        this.StoreType = StoreType;
    }

    /**
     * Get Repository status. ON: enabled; OFF: disabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StoreState Repository status. ON: enabled; OFF: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStoreState() {
        return this.StoreState;
    }

    /**
     * Set Repository status. ON: enabled; OFF: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StoreState Repository status. ON: enabled; OFF: disabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStoreState(String StoreState) {
        this.StoreState = StoreState;
    }

    /**
     * Get Repository path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorePath Repository path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorePath() {
        return this.StorePath;
    }

    /**
     * Set Repository path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorePath Repository path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorePath(String StorePath) {
        this.StorePath = StorePath;
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

    }
}

