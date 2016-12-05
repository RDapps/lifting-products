package Java21;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;



public abstract class S3Credentials {

AWSCredentials credentials;

ClientConfiguration clientConfig = new ClientConfiguration();

    public S3Credentials() {
        this.credentials = new BasicAWSCredentials(accessKey, secretKey);
    }
clientConfig.setProtocol(Protocol.HTTP);

AmazonS3 conn = new AmazonS3Client(credentials, clientConfig);
conn.setEndpoint("endpoint.com");

String accessKey = "insert your access key here!";
String secretKey = "insert your secret key here!";

AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
AmazonS3 conn = new AmazonS3Client(credentials);
conn.setEndpoint("objects.dreamhost.com");

List<Bucket> buckets = conn.listBuckets();
for (Bucket bucket : buckets) {
        System.out.println(bucket.getName() + "\t" +
                StringUtils.fromDate(bucket.getCreationDate()));
}

        
    }
    //Path:    
    //    LINUX:    /home/sunil/.aws/credentials
    //    WINDOWS:  C:\Users\SUNIL\.aws\credentials
    //credentials = new ProfileCredentialsProvider("sunilgulabani").getCredentials();
  }

}