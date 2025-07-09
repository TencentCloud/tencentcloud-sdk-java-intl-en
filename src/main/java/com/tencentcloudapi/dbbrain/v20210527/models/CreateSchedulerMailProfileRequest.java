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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSchedulerMailProfileRequest extends AbstractModel {

    /**
    * Value range: 1-7, representing Monday to Sunday respectively.
    */
    @SerializedName("WeekConfiguration")
    @Expose
    private Long [] WeekConfiguration;

    /**
    * Email configuration.
    */
    @SerializedName("ProfileInfo")
    @Expose
    private ProfileInfo ProfileInfo;

    /**
    * Configuration name, which needs to be unique. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
    */
    @SerializedName("ProfileName")
    @Expose
    private String ProfileName;

    /**
    * ID of the instance for which to configure subscription.
    */
    @SerializedName("BindInstanceId")
    @Expose
    private String BindInstanceId;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Value range: 1-7, representing Monday to Sunday respectively. 
     * @return WeekConfiguration Value range: 1-7, representing Monday to Sunday respectively.
     */
    public Long [] getWeekConfiguration() {
        return this.WeekConfiguration;
    }

    /**
     * Set Value range: 1-7, representing Monday to Sunday respectively.
     * @param WeekConfiguration Value range: 1-7, representing Monday to Sunday respectively.
     */
    public void setWeekConfiguration(Long [] WeekConfiguration) {
        this.WeekConfiguration = WeekConfiguration;
    }

    /**
     * Get Email configuration. 
     * @return ProfileInfo Email configuration.
     */
    public ProfileInfo getProfileInfo() {
        return this.ProfileInfo;
    }

    /**
     * Set Email configuration.
     * @param ProfileInfo Email configuration.
     */
    public void setProfileInfo(ProfileInfo ProfileInfo) {
        this.ProfileInfo = ProfileInfo;
    }

    /**
     * Get Configuration name, which needs to be unique. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test". 
     * @return ProfileName Configuration name, which needs to be unique. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public String getProfileName() {
        return this.ProfileName;
    }

    /**
     * Set Configuration name, which needs to be unique. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     * @param ProfileName Configuration name, which needs to be unique. For scheduled task emails, the name should be in the format of "scheduler_" + {instanceId}, such as "schduler_cdb-test".
     */
    public void setProfileName(String ProfileName) {
        this.ProfileName = ProfileName;
    }

    /**
     * Get ID of the instance for which to configure subscription. 
     * @return BindInstanceId ID of the instance for which to configure subscription.
     */
    public String getBindInstanceId() {
        return this.BindInstanceId;
    }

    /**
     * Set ID of the instance for which to configure subscription.
     * @param BindInstanceId ID of the instance for which to configure subscription.
     */
    public void setBindInstanceId(String BindInstanceId) {
        this.BindInstanceId = BindInstanceId;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateSchedulerMailProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSchedulerMailProfileRequest(CreateSchedulerMailProfileRequest source) {
        if (source.WeekConfiguration != null) {
            this.WeekConfiguration = new Long[source.WeekConfiguration.length];
            for (int i = 0; i < source.WeekConfiguration.length; i++) {
                this.WeekConfiguration[i] = new Long(source.WeekConfiguration[i]);
            }
        }
        if (source.ProfileInfo != null) {
            this.ProfileInfo = new ProfileInfo(source.ProfileInfo);
        }
        if (source.ProfileName != null) {
            this.ProfileName = new String(source.ProfileName);
        }
        if (source.BindInstanceId != null) {
            this.BindInstanceId = new String(source.BindInstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WeekConfiguration.", this.WeekConfiguration);
        this.setParamObj(map, prefix + "ProfileInfo.", this.ProfileInfo);
        this.setParamSimple(map, prefix + "ProfileName", this.ProfileName);
        this.setParamSimple(map, prefix + "BindInstanceId", this.BindInstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

