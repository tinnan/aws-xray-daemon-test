# X-ray daemon test
1. Download AWS X-ray daemon.
2. Configure AWS profile. To send trace to X-ray the AWS profile must contains IAM role <code>AWSXRayDaemonWriteAccess</code>.
3. Run X-ray daemon with command
    >.\xray_windows.exe -o -n "ap-southeast-1"
   
   Option <code>-o</code> indicats daemon to run in local mode. It will not look for EC2 instance profile.
4. Start Sptring boot app from main class <code>XraydaemontestApplication01</code> 
and <code>XraydaemontestApplication02</code>.
5. Test call to API <code>http://localhost:8080/product/{id}</code>
and <code>http://localhost:8081/customer/{id}</code>
6. Check trace log in AWS X-ray console.
