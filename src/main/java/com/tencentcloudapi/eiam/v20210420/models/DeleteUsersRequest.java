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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUsersRequest extends AbstractModel{

    /**
    * List of IDs of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
    */
    @SerializedName("DeleteIdList")
    @Expose
    private String [] DeleteIdList;

    /**
    * List of usernames of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
    */
    @SerializedName("DeleteNameList")
    @Expose
    private String [] DeleteNameList;

    /**
     * Get List of IDs of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first. 
     * @return DeleteIdList List of IDs of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
     */
    public String [] getDeleteIdList() {
        return this.DeleteIdList;
    }

    /**
     * Set List of IDs of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
     * @param DeleteIdList List of IDs of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
     */
    public void setDeleteIdList(String [] DeleteIdList) {
        this.DeleteIdList = DeleteIdList;
    }

    /**
     * Get List of usernames of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first. 
     * @return DeleteNameList List of usernames of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
     */
    public String [] getDeleteNameList() {
        return this.DeleteNameList;
    }

    /**
     * Set List of usernames of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
     * @param DeleteNameList List of usernames of the users to be deleted. You need to specify at least `DeleteIdList` or `DeleteNameList`. If both are specified, `DeleteNameList` will be used first.
     */
    public void setDeleteNameList(String [] DeleteNameList) {
        this.DeleteNameList = DeleteNameList;
    }

    public DeleteUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsersRequest(DeleteUsersRequest source) {
        if (source.DeleteIdList != null) {
            this.DeleteIdList = new String[source.DeleteIdList.length];
            for (int i = 0; i < source.DeleteIdList.length; i++) {
                this.DeleteIdList[i] = new String(source.DeleteIdList[i]);
            }
        }
        if (source.DeleteNameList != null) {
            this.DeleteNameList = new String[source.DeleteNameList.length];
            for (int i = 0; i < source.DeleteNameList.length; i++) {
                this.DeleteNameList[i] = new String(source.DeleteNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeleteIdList.", this.DeleteIdList);
        this.setParamArraySimple(map, prefix + "DeleteNameList.", this.DeleteNameList);

    }
}

