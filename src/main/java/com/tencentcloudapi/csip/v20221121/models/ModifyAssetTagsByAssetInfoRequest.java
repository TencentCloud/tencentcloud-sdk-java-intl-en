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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssetTagsByAssetInfoRequest extends AbstractModel {

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Asset list</p>
    */
    @SerializedName("Assets")
    @Expose
    private AssetTagModifyAssetItem [] Assets;

    /**
    * <p>Tag ID list</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>Operation type</p>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Asset list</p> 
     * @return Assets <p>Asset list</p>
     */
    public AssetTagModifyAssetItem [] getAssets() {
        return this.Assets;
    }

    /**
     * Set <p>Asset list</p>
     * @param Assets <p>Asset list</p>
     */
    public void setAssets(AssetTagModifyAssetItem [] Assets) {
        this.Assets = Assets;
    }

    /**
     * Get <p>Tag ID list</p> 
     * @return TagIDs <p>Tag ID list</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>Tag ID list</p>
     * @param TagIDs <p>Tag ID list</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get <p>Operation type</p> 
     * @return OperationType <p>Operation type</p>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>Operation type</p>
     * @param OperationType <p>Operation type</p>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public ModifyAssetTagsByAssetInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetTagsByAssetInfoRequest(ModifyAssetTagsByAssetInfoRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Assets != null) {
            this.Assets = new AssetTagModifyAssetItem[source.Assets.length];
            for (int i = 0; i < source.Assets.length; i++) {
                this.Assets[i] = new AssetTagModifyAssetItem(source.Assets[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Assets.", this.Assets);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

