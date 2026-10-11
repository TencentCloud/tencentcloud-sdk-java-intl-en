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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchOption extends AbstractModel {

    /**
    * <p>Whether to return the permission list in response. Default false.</p>
    */
    @SerializedName("FetchPermissions")
    @Expose
    private Boolean FetchPermissions;

    /**
    * <p>Whether to obtain feature table details. Valid when AssetType is TABLE.</p>
    */
    @SerializedName("FetchFeatureTableDetail")
    @Expose
    private Boolean FetchFeatureTableDetail;

    /**
    * <p>Filter by permission. Pass in a list of permissions to return only entities for which the current user has the specified permissions. For example, passing in ["SELECT_TABLE"] returns only entities for which the current user has the SELECT_TABLE permission. This only takes effect for the list Interface. If empty, no permission filtering is performed.</p>
    */
    @SerializedName("FilterPermissions")
    @Expose
    private String [] FilterPermissions;

    /**
    * <p>Whether to return person in charge information in response. If this parameter is not passed or is true, the person in charge information is returned by default. If it is explicitly set to false, it is not returned.</p>
    */
    @SerializedName("FetchOwners")
    @Expose
    private Boolean FetchOwners;

    /**
    * <p>Whether to convert user Uin to userName. Impact range: CreatorName/LastModifierName in Audit, OwnerName in MetaOwner. If not passed or set to true, conversion is executed (default conversion). If explicitly set to false, do not convert</p>
    */
    @SerializedName("FetchUserInfo")
    @Expose
    private Boolean FetchUserInfo;

    /**
    * <p>Whether to return field masking policy information. It is not returned by default. If true is passed in, the field masking policy information corresponding to the table fields will be queried.</p>
    */
    @SerializedName("FetchMask")
    @Expose
    private Boolean FetchMask;

    /**
    * <p>Whether to return tag information. By default, it is not returned. When set to true, APIs such as GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels will return the Tags field in the corresponding entity.</p>
    */
    @SerializedName("FetchTags")
    @Expose
    private Boolean FetchTags;

    /**
    * <p>Whether to return the dictionary dimension information associated with the returned field. Default not passed, do not return</p>
    */
    @SerializedName("FetchDimensions")
    @Expose
    private Boolean FetchDimensions;

    /**
     * Get <p>Whether to return the permission list in response. Default false.</p> 
     * @return FetchPermissions <p>Whether to return the permission list in response. Default false.</p>
     */
    public Boolean getFetchPermissions() {
        return this.FetchPermissions;
    }

    /**
     * Set <p>Whether to return the permission list in response. Default false.</p>
     * @param FetchPermissions <p>Whether to return the permission list in response. Default false.</p>
     */
    public void setFetchPermissions(Boolean FetchPermissions) {
        this.FetchPermissions = FetchPermissions;
    }

    /**
     * Get <p>Whether to obtain feature table details. Valid when AssetType is TABLE.</p> 
     * @return FetchFeatureTableDetail <p>Whether to obtain feature table details. Valid when AssetType is TABLE.</p>
     */
    public Boolean getFetchFeatureTableDetail() {
        return this.FetchFeatureTableDetail;
    }

    /**
     * Set <p>Whether to obtain feature table details. Valid when AssetType is TABLE.</p>
     * @param FetchFeatureTableDetail <p>Whether to obtain feature table details. Valid when AssetType is TABLE.</p>
     */
    public void setFetchFeatureTableDetail(Boolean FetchFeatureTableDetail) {
        this.FetchFeatureTableDetail = FetchFeatureTableDetail;
    }

    /**
     * Get <p>Filter by permission. Pass in a list of permissions to return only entities for which the current user has the specified permissions. For example, passing in ["SELECT_TABLE"] returns only entities for which the current user has the SELECT_TABLE permission. This only takes effect for the list Interface. If empty, no permission filtering is performed.</p> 
     * @return FilterPermissions <p>Filter by permission. Pass in a list of permissions to return only entities for which the current user has the specified permissions. For example, passing in ["SELECT_TABLE"] returns only entities for which the current user has the SELECT_TABLE permission. This only takes effect for the list Interface. If empty, no permission filtering is performed.</p>
     */
    public String [] getFilterPermissions() {
        return this.FilterPermissions;
    }

    /**
     * Set <p>Filter by permission. Pass in a list of permissions to return only entities for which the current user has the specified permissions. For example, passing in ["SELECT_TABLE"] returns only entities for which the current user has the SELECT_TABLE permission. This only takes effect for the list Interface. If empty, no permission filtering is performed.</p>
     * @param FilterPermissions <p>Filter by permission. Pass in a list of permissions to return only entities for which the current user has the specified permissions. For example, passing in ["SELECT_TABLE"] returns only entities for which the current user has the SELECT_TABLE permission. This only takes effect for the list Interface. If empty, no permission filtering is performed.</p>
     */
    public void setFilterPermissions(String [] FilterPermissions) {
        this.FilterPermissions = FilterPermissions;
    }

    /**
     * Get <p>Whether to return person in charge information in response. If this parameter is not passed or is true, the person in charge information is returned by default. If it is explicitly set to false, it is not returned.</p> 
     * @return FetchOwners <p>Whether to return person in charge information in response. If this parameter is not passed or is true, the person in charge information is returned by default. If it is explicitly set to false, it is not returned.</p>
     */
    public Boolean getFetchOwners() {
        return this.FetchOwners;
    }

    /**
     * Set <p>Whether to return person in charge information in response. If this parameter is not passed or is true, the person in charge information is returned by default. If it is explicitly set to false, it is not returned.</p>
     * @param FetchOwners <p>Whether to return person in charge information in response. If this parameter is not passed or is true, the person in charge information is returned by default. If it is explicitly set to false, it is not returned.</p>
     */
    public void setFetchOwners(Boolean FetchOwners) {
        this.FetchOwners = FetchOwners;
    }

    /**
     * Get <p>Whether to convert user Uin to userName. Impact range: CreatorName/LastModifierName in Audit, OwnerName in MetaOwner. If not passed or set to true, conversion is executed (default conversion). If explicitly set to false, do not convert</p> 
     * @return FetchUserInfo <p>Whether to convert user Uin to userName. Impact range: CreatorName/LastModifierName in Audit, OwnerName in MetaOwner. If not passed or set to true, conversion is executed (default conversion). If explicitly set to false, do not convert</p>
     */
    public Boolean getFetchUserInfo() {
        return this.FetchUserInfo;
    }

    /**
     * Set <p>Whether to convert user Uin to userName. Impact range: CreatorName/LastModifierName in Audit, OwnerName in MetaOwner. If not passed or set to true, conversion is executed (default conversion). If explicitly set to false, do not convert</p>
     * @param FetchUserInfo <p>Whether to convert user Uin to userName. Impact range: CreatorName/LastModifierName in Audit, OwnerName in MetaOwner. If not passed or set to true, conversion is executed (default conversion). If explicitly set to false, do not convert</p>
     */
    public void setFetchUserInfo(Boolean FetchUserInfo) {
        this.FetchUserInfo = FetchUserInfo;
    }

    /**
     * Get <p>Whether to return field masking policy information. It is not returned by default. If true is passed in, the field masking policy information corresponding to the table fields will be queried.</p> 
     * @return FetchMask <p>Whether to return field masking policy information. It is not returned by default. If true is passed in, the field masking policy information corresponding to the table fields will be queried.</p>
     */
    public Boolean getFetchMask() {
        return this.FetchMask;
    }

    /**
     * Set <p>Whether to return field masking policy information. It is not returned by default. If true is passed in, the field masking policy information corresponding to the table fields will be queried.</p>
     * @param FetchMask <p>Whether to return field masking policy information. It is not returned by default. If true is passed in, the field masking policy information corresponding to the table fields will be queried.</p>
     */
    public void setFetchMask(Boolean FetchMask) {
        this.FetchMask = FetchMask;
    }

    /**
     * Get <p>Whether to return tag information. By default, it is not returned. When set to true, APIs such as GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels will return the Tags field in the corresponding entity.</p> 
     * @return FetchTags <p>Whether to return tag information. By default, it is not returned. When set to true, APIs such as GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels will return the Tags field in the corresponding entity.</p>
     */
    public Boolean getFetchTags() {
        return this.FetchTags;
    }

    /**
     * Set <p>Whether to return tag information. By default, it is not returned. When set to true, APIs such as GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels will return the Tags field in the corresponding entity.</p>
     * @param FetchTags <p>Whether to return tag information. By default, it is not returned. When set to true, APIs such as GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels will return the Tags field in the corresponding entity.</p>
     */
    public void setFetchTags(Boolean FetchTags) {
        this.FetchTags = FetchTags;
    }

    /**
     * Get <p>Whether to return the dictionary dimension information associated with the returned field. Default not passed, do not return</p> 
     * @return FetchDimensions <p>Whether to return the dictionary dimension information associated with the returned field. Default not passed, do not return</p>
     */
    public Boolean getFetchDimensions() {
        return this.FetchDimensions;
    }

    /**
     * Set <p>Whether to return the dictionary dimension information associated with the returned field. Default not passed, do not return</p>
     * @param FetchDimensions <p>Whether to return the dictionary dimension information associated with the returned field. Default not passed, do not return</p>
     */
    public void setFetchDimensions(Boolean FetchDimensions) {
        this.FetchDimensions = FetchDimensions;
    }

    public FetchOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchOption(FetchOption source) {
        if (source.FetchPermissions != null) {
            this.FetchPermissions = new Boolean(source.FetchPermissions);
        }
        if (source.FetchFeatureTableDetail != null) {
            this.FetchFeatureTableDetail = new Boolean(source.FetchFeatureTableDetail);
        }
        if (source.FilterPermissions != null) {
            this.FilterPermissions = new String[source.FilterPermissions.length];
            for (int i = 0; i < source.FilterPermissions.length; i++) {
                this.FilterPermissions[i] = new String(source.FilterPermissions[i]);
            }
        }
        if (source.FetchOwners != null) {
            this.FetchOwners = new Boolean(source.FetchOwners);
        }
        if (source.FetchUserInfo != null) {
            this.FetchUserInfo = new Boolean(source.FetchUserInfo);
        }
        if (source.FetchMask != null) {
            this.FetchMask = new Boolean(source.FetchMask);
        }
        if (source.FetchTags != null) {
            this.FetchTags = new Boolean(source.FetchTags);
        }
        if (source.FetchDimensions != null) {
            this.FetchDimensions = new Boolean(source.FetchDimensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FetchPermissions", this.FetchPermissions);
        this.setParamSimple(map, prefix + "FetchFeatureTableDetail", this.FetchFeatureTableDetail);
        this.setParamArraySimple(map, prefix + "FilterPermissions.", this.FilterPermissions);
        this.setParamSimple(map, prefix + "FetchOwners", this.FetchOwners);
        this.setParamSimple(map, prefix + "FetchUserInfo", this.FetchUserInfo);
        this.setParamSimple(map, prefix + "FetchMask", this.FetchMask);
        this.setParamSimple(map, prefix + "FetchTags", this.FetchTags);
        this.setParamSimple(map, prefix + "FetchDimensions", this.FetchDimensions);

    }
}

