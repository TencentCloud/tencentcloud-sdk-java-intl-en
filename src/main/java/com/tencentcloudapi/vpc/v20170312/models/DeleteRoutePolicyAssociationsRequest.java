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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoutePolicyAssociationsRequest extends AbstractModel {

    /**
    * Routing policy binding object list. during routing policy unbinding, use the RouteTableId and RoutePolicyId fields of RoutePolicyAssociation (you do not need to fill in the Priority field).
    */
    @SerializedName("RoutePolicyAssociationSet")
    @Expose
    private RoutePolicyAssociation [] RoutePolicyAssociationSet;

    /**
     * Get Routing policy binding object list. during routing policy unbinding, use the RouteTableId and RoutePolicyId fields of RoutePolicyAssociation (you do not need to fill in the Priority field). 
     * @return RoutePolicyAssociationSet Routing policy binding object list. during routing policy unbinding, use the RouteTableId and RoutePolicyId fields of RoutePolicyAssociation (you do not need to fill in the Priority field).
     */
    public RoutePolicyAssociation [] getRoutePolicyAssociationSet() {
        return this.RoutePolicyAssociationSet;
    }

    /**
     * Set Routing policy binding object list. during routing policy unbinding, use the RouteTableId and RoutePolicyId fields of RoutePolicyAssociation (you do not need to fill in the Priority field).
     * @param RoutePolicyAssociationSet Routing policy binding object list. during routing policy unbinding, use the RouteTableId and RoutePolicyId fields of RoutePolicyAssociation (you do not need to fill in the Priority field).
     */
    public void setRoutePolicyAssociationSet(RoutePolicyAssociation [] RoutePolicyAssociationSet) {
        this.RoutePolicyAssociationSet = RoutePolicyAssociationSet;
    }

    public DeleteRoutePolicyAssociationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoutePolicyAssociationsRequest(DeleteRoutePolicyAssociationsRequest source) {
        if (source.RoutePolicyAssociationSet != null) {
            this.RoutePolicyAssociationSet = new RoutePolicyAssociation[source.RoutePolicyAssociationSet.length];
            for (int i = 0; i < source.RoutePolicyAssociationSet.length; i++) {
                this.RoutePolicyAssociationSet[i] = new RoutePolicyAssociation(source.RoutePolicyAssociationSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RoutePolicyAssociationSet.", this.RoutePolicyAssociationSet);

    }
}

