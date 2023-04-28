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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogsRequest extends AbstractModel{

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * MD5 value of a SQL template
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Start time in the format of "2019-09-10 12:13:14".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of queried items. Default value: `20`. Max value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Database list
    */
    @SerializedName("DB")
    @Expose
    private String [] DB;

    /**
    * Keyword
    */
    @SerializedName("Key")
    @Expose
    private String [] Key;

    /**
    * User
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * ip
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * Duration range. The left and right borders of the range are the zeroth and first element of the array, respectively.
    */
    @SerializedName("Time")
    @Expose
    private Long [] Time;

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

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get MD5 value of a SQL template 
     * @return Md5 MD5 value of a SQL template
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set MD5 value of a SQL template
     * @param Md5 MD5 value of a SQL template
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Start time in the format of "2019-09-10 12:13:14". 
     * @return StartTime Start time in the format of "2019-09-10 12:13:14".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in the format of "2019-09-10 12:13:14".
     * @param StartTime Start time in the format of "2019-09-10 12:13:14".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days. 
     * @return EndTime End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
     * @param EndTime End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The offset. Default value: `0`. 
     * @return Offset The offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: `0`.
     * @param Offset The offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of queried items. Default value: `20`. Max value: `100`. 
     * @return Limit The number of queried items. Default value: `20`. Max value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of queried items. Default value: `20`. Max value: `100`.
     * @param Limit The number of queried items. Default value: `20`. Max value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Database list 
     * @return DB Database list
     */
    public String [] getDB() {
        return this.DB;
    }

    /**
     * Set Database list
     * @param DB Database list
     */
    public void setDB(String [] DB) {
        this.DB = DB;
    }

    /**
     * Get Keyword 
     * @return Key Keyword
     */
    public String [] getKey() {
        return this.Key;
    }

    /**
     * Set Keyword
     * @param Key Keyword
     */
    public void setKey(String [] Key) {
        this.Key = Key;
    }

    /**
     * Get User 
     * @return User User
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set User
     * @param User User
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get ip 
     * @return Ip ip
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set ip
     * @param Ip ip
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Duration range. The left and right borders of the range are the zeroth and first element of the array, respectively. 
     * @return Time Duration range. The left and right borders of the range are the zeroth and first element of the array, respectively.
     */
    public Long [] getTime() {
        return this.Time;
    }

    /**
     * Set Duration range. The left and right borders of the range are the zeroth and first element of the array, respectively.
     * @param Time Duration range. The left and right borders of the range are the zeroth and first element of the array, respectively.
     */
    public void setTime(Long [] Time) {
        this.Time = Time;
    }

    public DescribeSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogsRequest(DescribeSlowLogsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DB != null) {
            this.DB = new String[source.DB.length];
            for (int i = 0; i < source.DB.length; i++) {
                this.DB[i] = new String(source.DB[i]);
            }
        }
        if (source.Key != null) {
            this.Key = new String[source.Key.length];
            for (int i = 0; i < source.Key.length; i++) {
                this.Key[i] = new String(source.Key[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new Long[source.Time.length];
            for (int i = 0; i < source.Time.length; i++) {
                this.Time[i] = new Long(source.Time[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "DB.", this.DB);
        this.setParamArraySimple(map, prefix + "Key.", this.Key);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamArraySimple(map, prefix + "Time.", this.Time);

    }
}

