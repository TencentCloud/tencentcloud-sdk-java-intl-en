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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAddonRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Add-on name
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * addon version (default does not update if not passed. if AddonVersion is not passed, RawValues must be passed.).
    */
    @SerializedName("AddonVersion")
    @Expose
    private String AddonVersion;

    /**
    * Parameters of the addon, which is a base64-transcoded string in json format. (the addon parameters are obtained through DescribeAddonValues. when RawValues is not passed, AddonVersion must be provided.).
    */
    @SerializedName("RawValues")
    @Expose
    private String RawValues;

    /**
    * The update policy for the addon parameter supports two strategies: replace and merge. the default value is merge, which is compatible with old version apis. replace: use new RawValues to fully replace the original RawValues of the addon. merge: add or update the corresponding parameters in the original RawValues of the addon based on new RawValues.
    */
    @SerializedName("UpdateStrategy")
    @Expose
    private String UpdateStrategy;

    /**
    * Specifies whether to only perform an update check. when set to true, only the check is performed without updating the component.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Add-on name 
     * @return AddonName Add-on name
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set Add-on name
     * @param AddonName Add-on name
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get addon version (default does not update if not passed. if AddonVersion is not passed, RawValues must be passed.). 
     * @return AddonVersion addon version (default does not update if not passed. if AddonVersion is not passed, RawValues must be passed.).
     */
    public String getAddonVersion() {
        return this.AddonVersion;
    }

    /**
     * Set addon version (default does not update if not passed. if AddonVersion is not passed, RawValues must be passed.).
     * @param AddonVersion addon version (default does not update if not passed. if AddonVersion is not passed, RawValues must be passed.).
     */
    public void setAddonVersion(String AddonVersion) {
        this.AddonVersion = AddonVersion;
    }

    /**
     * Get Parameters of the addon, which is a base64-transcoded string in json format. (the addon parameters are obtained through DescribeAddonValues. when RawValues is not passed, AddonVersion must be provided.). 
     * @return RawValues Parameters of the addon, which is a base64-transcoded string in json format. (the addon parameters are obtained through DescribeAddonValues. when RawValues is not passed, AddonVersion must be provided.).
     */
    public String getRawValues() {
        return this.RawValues;
    }

    /**
     * Set Parameters of the addon, which is a base64-transcoded string in json format. (the addon parameters are obtained through DescribeAddonValues. when RawValues is not passed, AddonVersion must be provided.).
     * @param RawValues Parameters of the addon, which is a base64-transcoded string in json format. (the addon parameters are obtained through DescribeAddonValues. when RawValues is not passed, AddonVersion must be provided.).
     */
    public void setRawValues(String RawValues) {
        this.RawValues = RawValues;
    }

    /**
     * Get The update policy for the addon parameter supports two strategies: replace and merge. the default value is merge, which is compatible with old version apis. replace: use new RawValues to fully replace the original RawValues of the addon. merge: add or update the corresponding parameters in the original RawValues of the addon based on new RawValues. 
     * @return UpdateStrategy The update policy for the addon parameter supports two strategies: replace and merge. the default value is merge, which is compatible with old version apis. replace: use new RawValues to fully replace the original RawValues of the addon. merge: add or update the corresponding parameters in the original RawValues of the addon based on new RawValues.
     */
    public String getUpdateStrategy() {
        return this.UpdateStrategy;
    }

    /**
     * Set The update policy for the addon parameter supports two strategies: replace and merge. the default value is merge, which is compatible with old version apis. replace: use new RawValues to fully replace the original RawValues of the addon. merge: add or update the corresponding parameters in the original RawValues of the addon based on new RawValues.
     * @param UpdateStrategy The update policy for the addon parameter supports two strategies: replace and merge. the default value is merge, which is compatible with old version apis. replace: use new RawValues to fully replace the original RawValues of the addon. merge: add or update the corresponding parameters in the original RawValues of the addon based on new RawValues.
     */
    public void setUpdateStrategy(String UpdateStrategy) {
        this.UpdateStrategy = UpdateStrategy;
    }

    /**
     * Get Specifies whether to only perform an update check. when set to true, only the check is performed without updating the component. 
     * @return DryRun Specifies whether to only perform an update check. when set to true, only the check is performed without updating the component.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Specifies whether to only perform an update check. when set to true, only the check is performed without updating the component.
     * @param DryRun Specifies whether to only perform an update check. when set to true, only the check is performed without updating the component.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public UpdateAddonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAddonRequest(UpdateAddonRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AddonName != null) {
            this.AddonName = new String(source.AddonName);
        }
        if (source.AddonVersion != null) {
            this.AddonVersion = new String(source.AddonVersion);
        }
        if (source.RawValues != null) {
            this.RawValues = new String(source.RawValues);
        }
        if (source.UpdateStrategy != null) {
            this.UpdateStrategy = new String(source.UpdateStrategy);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonVersion", this.AddonVersion);
        this.setParamSimple(map, prefix + "RawValues", this.RawValues);
        this.setParamSimple(map, prefix + "UpdateStrategy", this.UpdateStrategy);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

