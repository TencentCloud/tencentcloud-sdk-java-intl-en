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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUsualLoginPlacesRequest extends AbstractModel{

    /**
    * CWP agent `UUID` array.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Login region information array.
    */
    @SerializedName("Places")
    @Expose
    private Place [] Places;

    /**
     * Get CWP agent `UUID` array. 
     * @return Uuids CWP agent `UUID` array.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set CWP agent `UUID` array.
     * @param Uuids CWP agent `UUID` array.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get Login region information array. 
     * @return Places Login region information array.
     */
    public Place [] getPlaces() {
        return this.Places;
    }

    /**
     * Set Login region information array.
     * @param Places Login region information array.
     */
    public void setPlaces(Place [] Places) {
        this.Places = Places;
    }

    public CreateUsualLoginPlacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUsualLoginPlacesRequest(CreateUsualLoginPlacesRequest source) {
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Places != null) {
            this.Places = new Place[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new Place(source.Places[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);

    }
}

