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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStreamPackageHarvestJobsRequest extends AbstractModel {

    /**
    * HarvestJob IDs, id is a globally unique identifier.
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
     * Get HarvestJob IDs, id is a globally unique identifier. 
     * @return IDs HarvestJob IDs, id is a globally unique identifier.
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set HarvestJob IDs, id is a globally unique identifier.
     * @param IDs HarvestJob IDs, id is a globally unique identifier.
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    public DeleteStreamPackageHarvestJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStreamPackageHarvestJobsRequest(DeleteStreamPackageHarvestJobsRequest source) {
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);

    }
}

