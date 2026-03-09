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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceFileUpload extends AbstractModel {

    /**
    * Truststore authentication file, default filename truststore.jks.
    */
    @SerializedName("TrustStore")
    @Expose
    private String TrustStore;

    /**
    * Keystore authentication file, default filename keystore.jks.
    */
    @SerializedName("KeyStore")
    @Expose
    private String KeyStore;

    /**
    * core-site.xml file.
    */
    @SerializedName("CoreSite")
    @Expose
    private String CoreSite;

    /**
    * hdfs-site.xml file.
    */
    @SerializedName("HdfsSite")
    @Expose
    private String HdfsSite;

    /**
    * hive-site.xml file.
    */
    @SerializedName("HiveSite")
    @Expose
    private String HiveSite;

    /**
    * hbase-site file.
    */
    @SerializedName("HBASESite")
    @Expose
    private String HBASESite;

    /**
    * Keytab file, default filename [data source name].keytab.
    */
    @SerializedName("KeyTab")
    @Expose
    private String KeyTab;

    /**
    * krb5.conf file.
    */
    @SerializedName("KRB5Conf")
    @Expose
    private String KRB5Conf;

    /**
    * Private key, default filename private_key.pem.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * Public key, default filename public_key.pem.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get Truststore authentication file, default filename truststore.jks. 
     * @return TrustStore Truststore authentication file, default filename truststore.jks.
     */
    public String getTrustStore() {
        return this.TrustStore;
    }

    /**
     * Set Truststore authentication file, default filename truststore.jks.
     * @param TrustStore Truststore authentication file, default filename truststore.jks.
     */
    public void setTrustStore(String TrustStore) {
        this.TrustStore = TrustStore;
    }

    /**
     * Get Keystore authentication file, default filename keystore.jks. 
     * @return KeyStore Keystore authentication file, default filename keystore.jks.
     */
    public String getKeyStore() {
        return this.KeyStore;
    }

    /**
     * Set Keystore authentication file, default filename keystore.jks.
     * @param KeyStore Keystore authentication file, default filename keystore.jks.
     */
    public void setKeyStore(String KeyStore) {
        this.KeyStore = KeyStore;
    }

    /**
     * Get core-site.xml file. 
     * @return CoreSite core-site.xml file.
     */
    public String getCoreSite() {
        return this.CoreSite;
    }

    /**
     * Set core-site.xml file.
     * @param CoreSite core-site.xml file.
     */
    public void setCoreSite(String CoreSite) {
        this.CoreSite = CoreSite;
    }

    /**
     * Get hdfs-site.xml file. 
     * @return HdfsSite hdfs-site.xml file.
     */
    public String getHdfsSite() {
        return this.HdfsSite;
    }

    /**
     * Set hdfs-site.xml file.
     * @param HdfsSite hdfs-site.xml file.
     */
    public void setHdfsSite(String HdfsSite) {
        this.HdfsSite = HdfsSite;
    }

    /**
     * Get hive-site.xml file. 
     * @return HiveSite hive-site.xml file.
     */
    public String getHiveSite() {
        return this.HiveSite;
    }

    /**
     * Set hive-site.xml file.
     * @param HiveSite hive-site.xml file.
     */
    public void setHiveSite(String HiveSite) {
        this.HiveSite = HiveSite;
    }

    /**
     * Get hbase-site file. 
     * @return HBASESite hbase-site file.
     */
    public String getHBASESite() {
        return this.HBASESite;
    }

    /**
     * Set hbase-site file.
     * @param HBASESite hbase-site file.
     */
    public void setHBASESite(String HBASESite) {
        this.HBASESite = HBASESite;
    }

    /**
     * Get Keytab file, default filename [data source name].keytab. 
     * @return KeyTab Keytab file, default filename [data source name].keytab.
     */
    public String getKeyTab() {
        return this.KeyTab;
    }

    /**
     * Set Keytab file, default filename [data source name].keytab.
     * @param KeyTab Keytab file, default filename [data source name].keytab.
     */
    public void setKeyTab(String KeyTab) {
        this.KeyTab = KeyTab;
    }

    /**
     * Get krb5.conf file. 
     * @return KRB5Conf krb5.conf file.
     */
    public String getKRB5Conf() {
        return this.KRB5Conf;
    }

    /**
     * Set krb5.conf file.
     * @param KRB5Conf krb5.conf file.
     */
    public void setKRB5Conf(String KRB5Conf) {
        this.KRB5Conf = KRB5Conf;
    }

    /**
     * Get Private key, default filename private_key.pem. 
     * @return PrivateKey Private key, default filename private_key.pem.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set Private key, default filename private_key.pem.
     * @param PrivateKey Private key, default filename private_key.pem.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get Public key, default filename public_key.pem. 
     * @return PublicKey Public key, default filename public_key.pem.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key, default filename public_key.pem.
     * @param PublicKey Public key, default filename public_key.pem.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public DataSourceFileUpload() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceFileUpload(DataSourceFileUpload source) {
        if (source.TrustStore != null) {
            this.TrustStore = new String(source.TrustStore);
        }
        if (source.KeyStore != null) {
            this.KeyStore = new String(source.KeyStore);
        }
        if (source.CoreSite != null) {
            this.CoreSite = new String(source.CoreSite);
        }
        if (source.HdfsSite != null) {
            this.HdfsSite = new String(source.HdfsSite);
        }
        if (source.HiveSite != null) {
            this.HiveSite = new String(source.HiveSite);
        }
        if (source.HBASESite != null) {
            this.HBASESite = new String(source.HBASESite);
        }
        if (source.KeyTab != null) {
            this.KeyTab = new String(source.KeyTab);
        }
        if (source.KRB5Conf != null) {
            this.KRB5Conf = new String(source.KRB5Conf);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrustStore", this.TrustStore);
        this.setParamSimple(map, prefix + "KeyStore", this.KeyStore);
        this.setParamSimple(map, prefix + "CoreSite", this.CoreSite);
        this.setParamSimple(map, prefix + "HdfsSite", this.HdfsSite);
        this.setParamSimple(map, prefix + "HiveSite", this.HiveSite);
        this.setParamSimple(map, prefix + "HBASESite", this.HBASESite);
        this.setParamSimple(map, prefix + "KeyTab", this.KeyTab);
        this.setParamSimple(map, prefix + "KRB5Conf", this.KRB5Conf);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

