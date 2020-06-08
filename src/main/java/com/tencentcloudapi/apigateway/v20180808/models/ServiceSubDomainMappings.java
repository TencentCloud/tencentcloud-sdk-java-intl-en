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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSubDomainMappings extends AbstractModel{

    /**
    * Whether to use the default path mapping. true: use the default path mapping. false: use the custom path mapping (`PathMappingSet` is required).
    */
    @SerializedName("IsDefaultMapping")
    @Expose
    private Boolean IsDefaultMapping;

    /**
    * Custom path mapping list.
    */
    @SerializedName("PathMappingSet")
    @Expose
    private PathMapping [] PathMappingSet;

    /**
     * Get Whether to use the default path mapping. true: use the default path mapping. false: use the custom path mapping (`PathMappingSet` is required). 
     * @return IsDefaultMapping Whether to use the default path mapping. true: use the default path mapping. false: use the custom path mapping (`PathMappingSet` is required).
     */
    public Boolean getIsDefaultMapping() {
        return this.IsDefaultMapping;
    }

    /**
     * Set Whether to use the default path mapping. true: use the default path mapping. false: use the custom path mapping (`PathMappingSet` is required).
     * @param IsDefaultMapping Whether to use the default path mapping. true: use the default path mapping. false: use the custom path mapping (`PathMappingSet` is required).
     */
    public void setIsDefaultMapping(Boolean IsDefaultMapping) {
        this.IsDefaultMapping = IsDefaultMapping;
    }

    /**
     * Get Custom path mapping list. 
     * @return PathMappingSet Custom path mapping list.
     */
    public PathMapping [] getPathMappingSet() {
        return this.PathMappingSet;
    }

    /**
     * Set Custom path mapping list.
     * @param PathMappingSet Custom path mapping list.
     */
    public void setPathMappingSet(PathMapping [] PathMappingSet) {
        this.PathMappingSet = PathMappingSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefaultMapping", this.IsDefaultMapping);
        this.setParamArrayObj(map, prefix + "PathMappingSet.", this.PathMappingSet);

    }
}

